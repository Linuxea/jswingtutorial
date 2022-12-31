import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class JViewportTutorial {

  public JViewportTutorial() {
    JLabel label = new JLabel("Label");
    label.setPreferredSize(new Dimension(1000, 1000));

    JScrollPane jScrollPane = new JScrollPane(label);

    JTextArea jTextArea = new JTextArea();
    jTextArea.setSize(400, 400);

    jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    jScrollPane.setViewportBorder(new LineBorder(Color.RED));
    jScrollPane.getViewport().add(jTextArea, null);

    JFrame basicJFrame = new JFrame();
    basicJFrame.add(jScrollPane, BorderLayout.CENTER);
    basicJFrame.setSize(400, 150);
    basicJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    basicJFrame.setVisible(true);
  }

  public static void main(String[] args) {
    new JViewportTutorial();
  }
}
