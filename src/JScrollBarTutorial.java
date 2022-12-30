import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class JScrollBarTutorial extends BasicJFrame {

  public JScrollBarTutorial() {

    JLabel jLabel = new JLabel();
    jLabel.setBounds(100, 50, 150, 50);

    JScrollBar jScrollBar = new JScrollBar();
    jScrollBar.setBounds(370, 0, 15, 360);
    jScrollBar.addAdjustmentListener(e -> jLabel.setText("垂直坐标:" + e.getValue() + ""));

    add(jLabel);
    add(jScrollBar);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }


  public static void main(String[] args) {
    new JScrollBarTutorial();
  }

}
