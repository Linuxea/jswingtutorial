import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JPasswordFieldTutorial {

  public static void main(String[] args) {

    JFrame jFrame = new JFrame();
    jFrame.setLayout(null);
    jFrame.setSize(400, 400);
    jFrame.setTitle("hello swing");

    JLabel username = new JLabel("用户名:");
    username.setBounds(10, 100, 50, 20);

    JTextField usernameField = new JTextField();
    usernameField.setBounds(60, 100, 120, 20);

    JLabel password = new JLabel("密码:");
    password.setBounds(10, 160, 50, 20);

    JTextField passwordField = new JPasswordField();
    passwordField.setBounds(60, 160, 120, 20);


    JLabel loginInfo = new JLabel();
    loginInfo.setBounds(60, 220, 200, 20);

    JButton login = new JButton("登录");
    login.addActionListener(e -> {
      String usernameFieldText = usernameField.getText();
      String passwordFieldText = passwordField.getText();
      loginInfo.setText("用户名是:" + usernameFieldText + "," + "密码是:" + passwordFieldText);
    });
    login.setBounds(60, 200, 80, 20);




    jFrame.add(username);
    jFrame.add(usernameField);
    jFrame.add(password);
    jFrame.add(passwordField);
    jFrame.add(login);
    jFrame.add(loginInfo);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jFrame.setVisible(true);
  }

}
