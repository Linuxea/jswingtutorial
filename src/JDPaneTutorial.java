import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class JDPaneTutorial extends JFrame {

  public JDPaneTutorial() {

    JDeskPanelFrame jDeskPanelFrame = new JDeskPanelFrame();
    jDeskPanelFrame.display(this);

    Container contentPane = getContentPane();
    contentPane.add(jDeskPanelFrame, BorderLayout.CENTER);

    setTitle("JDesktopPane Example");
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    new JDPaneTutorial();
  }
}


class JDeskPanelFrame extends JDesktopPane {

  int numFrames = 3, x = 30, y = 30;

  public void display(JDPaneTutorial dp) {
    for (int i = 0; i < numFrames; ++i) {
      JInternalFrame jframe = new JInternalFrame("Internal Frame " + i, true, true, true, true);

      jframe.setBounds(x, y, 250, 85);
      Container c1 = jframe.getContentPane();
      c1.add(new JLabel("I love my country"));
      dp.add(jframe);
      jframe.setVisible(true);
      y += 85;
    }
  }

}