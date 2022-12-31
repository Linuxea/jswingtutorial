import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class CanvasTutorial extends Canvas {

  public CanvasTutorial() {
    JFrame jFrame = new JFrame();
    jFrame.setSize(400, 400);
    jFrame.add(this);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jFrame.setVisible(true);
  }

  public static void main(String[] args) {
    new CanvasTutorial();
  }


  @Override
  public void paint(Graphics g) {
    Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Linux\\Desktop\\temp\\java.png");
    g.drawImage(icon, 120, 100, this);
  }
}
