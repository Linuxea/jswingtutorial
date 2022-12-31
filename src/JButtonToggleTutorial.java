import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JToggleButton;

public class JButtonToggleTutorial extends BasicJFrame implements ItemListener {

  private JToggleButton jToggleButton;

  public JButtonToggleTutorial() {

    JToggleButton button = this.button();
    add(button);

    setVisible(true);
  }

  public static void main(String[] args) {
    new JButtonToggleTutorial();
  }

  public JToggleButton button() {
    JToggleButton jToggleButton = new JToggleButton("off");
    jToggleButton.setBounds(0, 20, 50, 30);
    jToggleButton.setBackground(Color.GRAY);
    jToggleButton.addItemListener(this);
    this.jToggleButton = jToggleButton;
    return jToggleButton;
  }

  @Override
  public void itemStateChanged(ItemEvent e) {
    if (this.jToggleButton.isSelected()) {
      this.jToggleButton.setText("on");
    } else {
      this.jToggleButton.setText("off");
    }
  }
}
