import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class JToolBarTutorial extends BasicJFrame {

  public JToolBarTutorial() {

    Container contentPane = getContentPane();

    JToolBar jToolBar = this.jToolBar();

    contentPane.add(jToolBar, BorderLayout.NORTH);

    contentPane.add(this.jScrollPane(), BorderLayout.EAST);

    setVisible(true);
  }

  public static void main(String[] args) {
    new JToolBarTutorial();
  }

  public JToolBar jToolBar() {
    JToolBar jToolBar = new JToolBar();
    jToolBar.setRollover(true);
    jToolBar.setBounds(0, 10, 300, 20);

    JButton open = this.open();
    jToolBar.add(open);

    jToolBar.addSeparator();

    JButton edit = this.edit();
    jToolBar.add(edit);

    jToolBar.add(new JComboBox<>(new String[]{"China", "US", "India", "France"}));

    return jToolBar;
  }

  public JButton open() {
    return new JButton("open");
  }

  public JButton edit() {
    return new JButton("edit");
  }

  public JTextArea jTextArea() {
    return new JTextArea();
  }

  public JScrollPane jScrollPane() {
    return new JScrollPane(this.jTextArea());
  }
}
