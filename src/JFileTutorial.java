import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class JFileTutorial extends BasicJFrame implements ActionListener {

  // save reference to
  private JMenuItem openFileMenuItem;
  private JTextArea jTextArea;

  public JFileTutorial() {
    JMenuBar jMenuBar = this.jMenuBar();

    JTextArea jTextArea = jTextArea();

    setJMenuBar(jMenuBar);
    add(jTextArea);
    setVisible(true);
  }

  public static void main(String[] args) {
    new JFileTutorial();
  }

  public JMenuBar jMenuBar() {
    JMenuBar jMenuBar = new JMenuBar();
    JMenu file = this.file();

    jMenuBar.add(file);
    return jMenuBar;
  }

  public JMenu file() {
    JMenu jMenu = new JMenu("Open");
    JMenuItem file = new JMenuItem("file");
    file.addActionListener(this);
    openFileMenuItem = file;
    jMenu.add(file);
    return jMenu;
  }

  public JTextArea jTextArea() {
    JTextArea jTextArea = new JTextArea(800, 800);
    jTextArea.setBounds(0, 0, 800, 800);
    this.jTextArea = jTextArea;
    return jTextArea;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == openFileMenuItem) {

      JFileChooser jFileChooser = new JFileChooser();
      int dialog = jFileChooser.showDialog(this, "打开文件");
      if (JFileChooser.APPROVE_OPTION == dialog) {
        File selectedFile = jFileChooser.getSelectedFile();
        try {
          Path filePath = Paths.get(selectedFile.getPath());
          String allLines = Files.readString(filePath);
          this.jTextArea.setText(allLines);
        } catch (IOException ex) {
          throw new RuntimeException(ex);
        }
      }

    }
  }
}
