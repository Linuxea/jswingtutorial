import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class DigitalWatchTutorial extends BasicJFrame implements Runnable {

  private JButton time;

  public DigitalWatchTutorial() {

    JButton time = time();
    add(time);

    setVisible(true);
    new Thread(this).start();
  }

  public static void main(String[] args) {
    new DigitalWatchTutorial();
  }

  public JButton time() {
    JButton jButton = new JButton();
    jButton.setBounds(80, 10, 140, 20);
    DigitalWatchTutorial digitalWatchTutorial = this;
    jButton.addActionListener(e -> JOptionPane.showMessageDialog(digitalWatchTutorial,
        "现在时间是: " + new SimpleDateFormat("HH:mm:ss").format(new Date())));

    time = jButton;
    return jButton;
  }

  @Override
  public void run() {
    while (true) {
      time.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
