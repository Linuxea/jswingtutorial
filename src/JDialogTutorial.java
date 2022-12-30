import java.awt.FlowLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class JDialogTutorial extends BasicJFrame {

  public JDialogTutorial() {

    JDialog jDialog = new JDialog(this);
    jDialog.setTitle("hello jDialog");
    jDialog.add(new JLabel("hello this is a jLabel"));
    jDialog.setLayout(new FlowLayout());
    jDialog.setSize(120, 80);
    jDialog.setVisible(true);

    setVisible(true);
  }

  public static void main(String[] args) {
    new JDialogTutorial();
  }

}
