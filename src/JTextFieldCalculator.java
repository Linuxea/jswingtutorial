import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JTextFieldCalculator {

  public static void main(String[] args) {

    JFrame jFrame = new JFrame();
    jFrame.setLayout(null);
    jFrame.setSize(400, 400);
    jFrame.setTitle("hello swing");

    JTextField number = new JTextField();
    number.setBounds(50,50,150,20);

    JTextField anotherNumber = new JTextField();
    anotherNumber.setBounds(50,100,150,20);

    JLabel sumJLabel = new JLabel();
    sumJLabel.setBounds(50,150,150,20);

    JButton jButton = new JButton("+");
    jButton.setBounds(50,200,150,20);
    jButton.addActionListener(e -> {
      System.out.println(e.getSource());
      int sum = Integer.parseInt(number.getText()) + Integer.parseInt(anotherNumber.getText());
      sumJLabel.setText(sum + "");
    });

    jFrame.add(number);
    jFrame.add(anotherNumber);
    jFrame.add(sumJLabel);
    jFrame.add(jButton);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jFrame.setVisible(true);


  }

}
