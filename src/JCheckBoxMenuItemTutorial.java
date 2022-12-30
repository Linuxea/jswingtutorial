import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.AbstractButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class JCheckBoxMenuItemTutorial extends BasicJFrame {

  public JCheckBoxMenuItemTutorial() {

    JMenuBar jMenuBar = new JMenuBar();

    JMenu fileMenu = new JMenu("File");
    jMenuBar.add(fileMenu);

    JMenuItem open = new JMenuItem("Open");
    open.setMnemonic(KeyEvent.VK_F);
    fileMenu.add(open);

    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("ok");
    jCheckBoxMenuItem.setMnemonic(KeyEvent.VK_C);

    JCheckBoxMenuItemTutorial jCheckBoxMenuItemTutorial = this;
    jCheckBoxMenuItem.addActionListener(e -> {
      System.out.println(e.getSource());
      AbstractButton aButton = (AbstractButton) e.getSource();
      boolean selected = aButton.getModel().isSelected();
      JOptionPane.showMessageDialog(jCheckBoxMenuItemTutorial, "选项结果:" + selected);
    });
    fileMenu.add(jCheckBoxMenuItem);

    setJMenuBar(jMenuBar);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    new JCheckBoxMenuItemTutorial();
  }

}
