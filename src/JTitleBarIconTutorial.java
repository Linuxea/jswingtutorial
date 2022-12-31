import java.awt.Image;
import java.awt.Toolkit;

public class JTitleBarIconTutorial extends BasicJFrame {

  public JTitleBarIconTutorial() {

    Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Linux\\Desktop\\temp\\java.png");
    setIconImage(icon);
    setVisible(true);
  }

  public static void main(String[] args) {
    new JTitleBarIconTutorial();
  }
}
