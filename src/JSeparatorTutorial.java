import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class JSeparatorTutorial extends BasicJFrame {

  public JSeparatorTutorial() {
    setLayout(new GridLayout(0, 1));

    JLabel username = new JLabel("用户名:");
//    username.setBounds(10, 100, 50, 20);

//    JTextField usernameField = new JTextField();
//    usernameField.setBounds(60, 100, 120, 20);

    add(username);
//    add(usernameField);
    add(new JSeparator());

    JLabel password = new JLabel("密码:");
//    password.setBounds(10, 160, 50, 20);

//    JTextField passwordField = new JPasswordField();
//    passwordField.setBounds(60, 160, 120, 20);

    add(password);
//    add(passwordField);
    add(new JSeparator());

    JLabel loginInfo = new JLabel();
//    loginInfo.setBounds(60, 220, 200, 20);

    add(loginInfo);

//    JButton login = new JButton("登录");
//    login.addActionListener(e -> {
//      String usernameFieldText = usernameField.getText();
//      String passwordFieldText = passwordField.getText();
//      loginInfo.setText("用户名是:" + usernameFieldText + "," + "密码是:" + passwordFieldText);
//    });
//    login.setBounds(60, 200, 80, 20);
//    add(login);

    setSize(400, 100);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    new JSeparatorTutorial();
  }
}
