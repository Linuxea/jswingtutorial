import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonTutorial {

  public static void main(String[] args) {

    JFrame jFrame = new JFrame();
    jFrame.setLayout(null);
    jFrame.setSize(400, 400);
    jFrame.setTitle("hello swing");

    JTextField jTextField = new JTextField();
    jTextField.setBounds(50, 50, 150, 20);
    jTextField.setText("Hello I am a text filed");

    JButton jButton = new JButton(
        new ImageIcon("C:\\Users\\Linux\\Desktop\\temp\\ddd.png"));
    jButton.setBounds(130, 100, 130, 140);// x axis, y axis, width, height
    jButton.setVisible(true);
    jButton.addActionListener(e -> {
      System.out.println(e.getSource());
      System.out.println(e.getActionCommand());
      jTextField.setVisible(true);
      jTextField.setText(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    });

    jFrame.add(jButton);
    jFrame.add(jTextField);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jFrame.setVisible(true);
  }

}
