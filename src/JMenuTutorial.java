import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class JMenuTutorial extends BasicJFrame implements ActionListener {

  private final JMenuItem _select_all;
  private final JMenuItem _cut;
  private final JMenuItem _copy;
  private final JMenuItem _paste;
  private final JTextField jTextField;

  public JMenuTutorial() {

    JMenuBar jMenuBar = new JMenuBar();
    jMenuBar.setBounds(0, 0, 400, 20);

    jTextField = new JTextField("这是一段平平无奇的话");
    jTextField.setBounds(0, 100, 200, 20);

    JMenu fileMenu = new JMenu("File");
    JMenuItem _new = new JMenuItem("New");
    JMenuItem _open = new JMenuItem("Open");
    JMenu _recent_projects = new JMenu("Recent Projects");
    _recent_projects.add(new JMenuItem("work"));
    _recent_projects.add(new JMenuItem("java_tutorial"));

    fileMenu.add(_new);
    fileMenu.add(_open);
    fileMenu.add(_recent_projects);
    jMenuBar.add(fileMenu);

    JMenu editMenu = new JMenu("Edit");
    _select_all = new JMenuItem("_select_all");
    _select_all.addActionListener(this);
    _cut = new JMenuItem("Cut");
    _cut.addActionListener(this);
    _copy = new JMenuItem("Copy");
    _copy.addActionListener(this);
    _paste = new JMenuItem("Paste");
    _paste.addActionListener(this);
    editMenu.add(_select_all);
    editMenu.add(_cut);
    editMenu.add(_copy);
    editMenu.add(_paste);
    jMenuBar.add(editMenu);

    JMenu navigate = new JMenu("Navigate");
    JMenu code = new JMenu("Code");
    JMenu refactor = new JMenu("Refactor");
    JMenu build = new JMenu("Build");
    JMenu run = new JMenu("Run");

    jMenuBar.add(navigate);
    jMenuBar.add(code);
    jMenuBar.add(refactor);
    jMenuBar.add(build);
    jMenuBar.add(run);

    add(jTextField);
//    add(jMenuBar);
    setJMenuBar(jMenuBar);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    new JMenuTutorial();
  }


  @Override
  public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();
    if (source == _cut) {
      jTextField.cut();
    } else if (source == _copy) {
      jTextField.copy();
    } else if (source == _select_all) {
      jTextField.selectAll();
    } else if (source == _paste) {
      jTextField.paste();
    }

  }
}
