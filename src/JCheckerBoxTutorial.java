import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JCheckerBoxTutorial {

  public static void main(String[] args) {

    JFrame jFrame = new JFrame();
    jFrame.setLayout(null);
    jFrame.setSize(400, 400);
    jFrame.setTitle("hello JCheckerBoxTutorial");

    Checkbox apple = new Checkbox("apple", true);
    apple.setBounds(100,100, 50,50);
    apple.addItemListener(e -> {
      System.out.println(e.getStateChange());
      JOptionPane.showMessageDialog(jFrame, e.getStateChange());
    });
    Checkbox pear = new Checkbox("pear", true);
    pear.setBounds(100,150, 50,50);
    pear.addItemListener(e -> {
      System.out.println(e.getStateChange());
      JOptionPane.showMessageDialog(jFrame, e.getStateChange());
    });

    jFrame.add(apple);
    jFrame.add(pear);

    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jFrame.setVisible(true);

  }

}
