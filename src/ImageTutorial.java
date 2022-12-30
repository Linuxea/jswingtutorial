import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ImageTutorial {

  public static void main(String[] args) {

    JFrame jFrame = new JFrame();
    jFrame.setLayout(null);
    jFrame.setBounds(400, 400, 400, 400);
    jFrame.setTitle("hello swing");

    JButton jButton = new JButton();
    jButton.setSize(108, 160);

    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Linux\\Pictures\\333.png");
    jButton.setIcon(imageIcon);

    jFrame.add(jButton);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jFrame.setVisible(true);
  }

}
