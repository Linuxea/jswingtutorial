import javax.swing.Icon;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class JTabbedPaneTutorial extends BasicJFrame {

  public JTabbedPaneTutorial() {

    JTextArea ta = new JTextArea(200, 200);
    JPanel java = new JPanel();
    java.add(ta);

    JPanel python = new JPanel();

    JPanel go = new JPanel();

    JTabbedPane jTabbedPane = new JTabbedPane();
    jTabbedPane.setBounds(50, 50, 200, 200);
    jTabbedPane.add("java", java);
    jTabbedPane.add("python", python);
    jTabbedPane.add("go", go);

    add(jTabbedPane);
    setVisible(true);
  }


  public static void main(String[] args) {
    new JTabbedPaneTutorial();
  }

}
