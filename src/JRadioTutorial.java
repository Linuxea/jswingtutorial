import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class JRadioTutorial extends JFrame {

  public JRadioTutorial() {
  }


  public static void main(String[] args) {

    JRadioTutorial jFrame = new JRadioTutorial();
    jFrame.setLayout(null);
    jFrame.setSize(400, 400);
    jFrame.setTitle("hello swing");

    JLabel genderLabel = new JLabel("性别");
    genderLabel.setBounds(10, 100, 50, 20);

    JRadioButton maleRadio = new JRadioButton("男");
    maleRadio.setBounds(60, 100, 50, 20);
    maleRadio.addActionListener(e -> {
      System.out.println(e.getActionCommand());
      if (maleRadio.isSelected()) {
        JOptionPane.showMessageDialog(jFrame,"You are Male.");
      }
    });

    JRadioButton femaleRadio = new JRadioButton("女");
    femaleRadio.setBounds(120, 100, 50, 20);
    femaleRadio.addActionListener(e -> {
      System.out.println(e.getActionCommand());
      if (femaleRadio.isSelected()) {
        JOptionPane.showMessageDialog(jFrame,"You are Female.");
      }
    });

    ButtonGroup buttonGroup = new ButtonGroup();
    buttonGroup.add(maleRadio);
    buttonGroup.add(femaleRadio);

    jFrame.add(genderLabel);
    jFrame.add(maleRadio);
    jFrame.add(femaleRadio);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jFrame.setVisible(true);

  }

}
