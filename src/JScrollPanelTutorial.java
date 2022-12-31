import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JScrollPanelTutorial {

  public JScrollPanelTutorial() {

  }

  public static void main(String[] args) {
    JScrollPanelTutorial jScrollPanelTutorial = new JScrollPanelTutorial();
    javax.swing.SwingUtilities.invokeLater(jScrollPanelTutorial::drawUI);
  }

  public void drawUI() {
    final JFrame jFrame = new JFrame("Scroll Pane Example");

    // Display the window.
    jFrame.setSize(500, 500);
    jFrame.setVisible(true);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    jFrame.getContentPane().setLayout(new FlowLayout());

    JScrollPane jScrollPane = this.jScrollPane();
    jFrame.getContentPane().add(jScrollPane);
  }

  public JScrollPane jScrollPane() {
    JScrollPane jScrollPane = new JScrollPane(jTextArea());
    jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    return jScrollPane;
  }

  public JTextArea jTextArea() {
    JTextArea jTextArea = new JTextArea(20, 20);
    jTextArea.setText("abcdefg");
    return jTextArea;
  }
}
