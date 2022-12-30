import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class JSpinnerTutorial extends BasicJFrame {

  public JSpinnerTutorial() {

    SpinnerModel processSpinnerModel = new SpinnerNumberModel(0, 0, 100, 1);
    JSpinner jSpinner = new JSpinner(processSpinnerModel);
    jSpinner.setBounds(100, 100, 50, 30);

    add(jSpinner);

    JLabel jLabel = new JLabel("0");
    jLabel.setBounds(160, 100, 50, 30);
    jSpinner.addChangeListener(e -> jLabel.setText(jSpinner.getValue() + ""));
    add(jLabel);

    setVisible(true);
  }

  public static void main(String[] args) {
    new JSpinnerTutorial();
  }

}
