import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JComboBoxTutorial extends JFrame {

  public JComboBoxTutorial() {
  }


  public static void main(String[] args) {

    JComboBoxTutorial jFrame = new JComboBoxTutorial();
    jFrame.setLayout(null);
    jFrame.setSize(400, 400);
    jFrame.setTitle("hello JComboBoxTutorial");

    JLabel countryLabel = new JLabel("country:");
    countryLabel.setBounds(20, 100, 80, 30);

    JComboBox<String> jComboBox = new JComboBox<>();
    jComboBox.setBounds(100, 100, 80, 30);
    jComboBox.addItem("US");
    jComboBox.addItem("China");
    jComboBox.addItem("India");
    jComboBox.addItem("Australia");

    JLabel selectCountryLabel = new JLabel();
    selectCountryLabel.setBounds(20, 140, 120, 30);

    jComboBox.addActionListener(e -> {
      System.out.println(e.getActionCommand());
      System.out.println(e.getModifiers());
      Object selectedItem = jComboBox.getSelectedItem();
      selectCountryLabel.setText("你的国家是: " + selectedItem);
    });

    jFrame.add(countryLabel);
    jFrame.add(jComboBox);
    jFrame.add(selectCountryLabel);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jFrame.setVisible(true);

  }

}
