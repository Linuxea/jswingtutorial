import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

class MyJComponent extends JComponent {

  @Override
  public void paint(Graphics g) {
    g.setColor(Color.green);
    g.fillRect(0, 0, 400, 400);

    g.setColor(Color.blue);
    g.fillRect(150, 150, 50, 50);
  }
}

public class JComponentTutorial extends JFrame {

  public JComponentTutorial() {

    MyJComponent myJComponent = new MyJComponent();

    add(myJComponent);
    setSize(400, 400);
    setDefaultLookAndFeelDecorated(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    new JComponentTutorial();
  }

}
