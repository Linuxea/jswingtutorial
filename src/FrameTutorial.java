import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTutorial {

  public static void main(String[] args) {

    JFrame jFrame = new JFrame();
    jFrame.setLayout(null);
    jFrame.setBounds(400, 400, 400, 400);
    jFrame.setTitle("hello swing");

    JButton jButton = new JButton("click");
    jButton.setBounds(130, 100, 100, 40);//x axis, y axis, width, height
    jButton.setVisible(true);
    jFrame.setLayout(null);

    jFrame.add(jButton);

    jFrame.setVisible(true);
  }

}
