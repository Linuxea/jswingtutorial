import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelTutorial extends BasicJFrame {

  public JPanelTutorial() {
    JPanel wrapper = wrapper();
    add(wrapper);
    setVisible(true);
  }

  public static void main(String[] args) {
    new JPanelTutorial();
  }

  public JPanel wrapper() {
    JPanel jPanel = this.jPanel();
    JButton one = this.one();
    JButton two = this.two();
    jPanel.add(one);
    jPanel.add(two);
    return jPanel;
  }

  public JPanel jPanel() {
    JPanel jPanel = new JPanel();
    jPanel.setBounds(100, 100, 200, 200);
    jPanel.setBackground(Color.gray);
    return jPanel;
  }

  public JButton one() {
    JButton jButton = new JButton("green");
    jButton.setBounds(50, 50, 80, 30);
    jButton.setBackground(Color.green);
    return jButton;
  }

  public JButton two() {
    JButton jButton = new JButton("yellow");
    jButton.setBounds(100, 50, 80, 30);
    jButton.setBackground(Color.yellow);
    return jButton;
  }

}
