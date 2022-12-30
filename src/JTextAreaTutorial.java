import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class JTextAreaTutorial {

  public static void main(String[] args) {

    JFrame jFrame = new JFrame();
    jFrame.setLayout(null);
    jFrame.setSize(400, 400);
    jFrame.setTitle("hello swing");

    JLabel jLabel = new JLabel("wait ... ");
    jLabel.setBounds(10, 30, 200, 30);

    JTextArea jTextArea = new JTextArea();
    jTextArea.setBounds(10, 70, 200, 200);

    JButton jButton = new JButton("Counter");
    jButton.setBounds(10, 300, 60, 30);
    jButton.addActionListener(e -> {
      String text = jTextArea.getText();
      String[] words = text.split("\\s");
      jLabel.setText("Words: " + words.length + ";" + "Characters: " + text.length());
    });

    jFrame.add(jTextArea);
    jFrame.add(jLabel);
    jFrame.add(jButton);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jFrame.setVisible(true);

  }

}
