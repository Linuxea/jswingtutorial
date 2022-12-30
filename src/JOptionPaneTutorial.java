import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPaneTutorial extends WindowAdapter {

  private final JFrame jFrame;

  public JOptionPaneTutorial() {
    jFrame = new JFrame();
    jFrame.setLayout(null);
    jFrame.setSize(400, 400);
    jFrame.setTitle("hello " + this.getClass().getSimpleName());
    jFrame.addWindowListener(this);


//    JLabel confirmResult = new JLabel("result");
//    confirmResult.setBounds(100, 100, 75, 75);

//    JOptionPane.showMessageDialog(this, "are you sure?");

//    String name = JOptionPane.showInputDialog(this, "Enter Name");
//    confirmResult.setText(name);

//    int a = JOptionPane.showConfirmDialog(jFrame, "Are you sure?");
//    if (a == JOptionPane.YES_OPTION) {
//      jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }

//    jFrame.add(confirmResult);
    jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    jFrame.setVisible(true);
  }

  public static void main(String[] args) {
    new JOptionPaneTutorial();
  }

  @Override
  public void windowClosing(WindowEvent e) {
    int a = JOptionPane.showConfirmDialog(this.jFrame, "Are you sure?");
    if (a == JOptionPane.YES_OPTION) {
      this.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  }

}
