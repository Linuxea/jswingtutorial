import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class JListTutorial extends JFrame {

  public JListTutorial() {
    setLayout(null);
    setSize(400, 400);
    setTitle("hello " + this.getClass().getSimpleName());

    DefaultListModel<String> classes = new DefaultListModel<>();
    classes.addElement("chinese");
    classes.addElement("math");
    classes.addElement("music");
    classes.addElement("cs");
    JList<String> list = new JList<>(classes);
    list.setBounds(100, 100, 75, 75);
    add(list);

    JLabel loginInfo = new JLabel();
    loginInfo.setBounds(100, 220, 380, 30);
    add(loginInfo);

    JButton jButton = new JButton("show");
    jButton.setBounds(100, 180, 80, 30);
    jButton.addActionListener(e -> {
      System.out.println(e.getActionCommand());
      System.out.println(e.getModifiers());
      System.out.println(e.getSource());
      List<String> selectedValuesList = list.getSelectedValuesList();
      loginInfo.setText("选择的课程是:" + String.join(",", selectedValuesList));
    });

    add(jButton);
    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    super.setVisible(true);
  }


  public static void main(String[] args) {

    new JListTutorial();

  }

}
