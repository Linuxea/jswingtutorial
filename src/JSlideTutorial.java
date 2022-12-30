import static javax.swing.SwingConstants.HORIZONTAL;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class JSlideTutorial extends JFrame {

  public JSlideTutorial() {

    JLabel jLabel = new JLabel("当前刻度:000");

    JSlider jSlider = new JSlider(HORIZONTAL, 0, 100, 50);
    jSlider.setMinorTickSpacing(2);
    jSlider.setMajorTickSpacing(10);
    jSlider.setPaintTicks(true);
    jSlider.setPaintLabels(true);

    jSlider.addChangeListener(e -> {
      Object source = e.getSource();
      if (source == jSlider) {
        int value = jSlider.getValue();
        System.out.println(value);
        jLabel.setText("当前刻度:" + value);
      }
    });

    JPanel jPanel = new JPanel();
    jPanel.add(jLabel);
    jPanel.add(jSlider);

    add(jPanel);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    JSlideTutorial jSlideTutorial = new JSlideTutorial();
    jSlideTutorial.pack();
    jSlideTutorial.setVisible(true);
  }

}
