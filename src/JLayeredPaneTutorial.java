import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class JLayeredPaneTutorial extends JFrame {

  public JLayeredPaneTutorial() {

    JButton top = new JButton();
    top.setBackground(Color.green);
    top.setBounds(20, 20, 50, 50);

    JButton middle = new JButton();
    middle.setBackground(Color.yellow);
    middle.setBounds(40, 40, 50, 50);

    JButton bottom = new JButton();
    bottom.setBackground(Color.black);
    bottom.setBounds(60, 60, 50, 50);

    JLayeredPane jLayeredPane = new JLayeredPane();
    jLayeredPane.add(top, 1);
    jLayeredPane.add(middle, 2);
    jLayeredPane.add(bottom, 3);

    add(jLayeredPane);

    setSize(400, 400);
    setTitle("hello " + this.getClass().getSimpleName());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    new JLayeredPaneTutorial();
  }
}
