import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;

public class JColorChooserTutorial extends BasicJFrame implements ActionListener {

  private final JButton jButton;
  private final Container contentPane;
  private Color color = Color.black;

  public JColorChooserTutorial() {

    contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());

    jButton = new JButton("采色器");
    jButton.addActionListener(this);

    add(jButton);
    setVisible(true);
  }

  public static void main(String[] args) {
    new JColorChooserTutorial();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();
    if (source == jButton) {
      Color selectAColor = JColorChooser.showDialog(this, "Select a color", color);
      contentPane.setBackground(selectAColor);
    }
  }
}
