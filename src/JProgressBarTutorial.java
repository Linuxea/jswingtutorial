import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class JProgressBarTutorial extends BasicJFrame implements Runnable {

  private final JProgressBar jProgressBar;
  private final AtomicBoolean running = new AtomicBoolean(true);

  public JProgressBarTutorial() {

    this.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        running.set(false);
      }
    });

    jProgressBar = new JProgressBar(SwingConstants.HORIZONTAL, 0, 100);
    jProgressBar.setBounds(0, 330, 400, 20);
    jProgressBar.setValue(0);
    jProgressBar.setStringPainted(true);

    add(jProgressBar);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    new Thread(this).start();
  }

  public static void main(String[] args) {
    new JProgressBarTutorial();
  }

  @Override
  public void run() {
    while (running.get()) {
      int value = jProgressBar.getValue();
      if (value >= 100) {
        break;
      }
      int nextInt = new Random().nextInt(10);
      jProgressBar.setValue(Math.min(value + nextInt, 100));
      try {
        TimeUnit.MILLISECONDS.sleep(100);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    System.out.println("退出进度描绘");
    jProgressBar.setString("下载完成(100%)");
  }
}
