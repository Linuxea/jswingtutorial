import java.net.UnknownHostException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JLabelTutorial {

  public static void main(String[] args) {

    JFrame jFrame = new JFrame();
    jFrame.setLayout(null);
    jFrame.setSize(400, 400);
    jFrame.setTitle("hello swing");

    JTextField jTextField = new JTextField("请在这里输入网址");
    jTextField.setBounds(10, 100, 150, 30);

    javax.swing.JLabel jLabel = new javax.swing.JLabel("小明：元旦快乐");
    jLabel.setBounds(10, 10, 150, 50);

    javax.swing.JLabel jLabel2 = new javax.swing.JLabel("小红：你也元旦快乐");
    jLabel2.setBounds(10, 20, 150, 50);

    JButton getIpButton = new JButton("获取ip");
    getIpButton.setBounds(10, 140, 150, 30);
    getIpButton.addActionListener(e -> {
      String host = jTextField.getText();
      String ip;
      try {
        ip = java.net.InetAddress.getByName(host).getHostAddress();
      } catch (UnknownHostException ex) {
        jTextField.setText("IP of " + host + "获取失败");
        return;
      }
      jTextField.setText("IP of " + host + " is: " + ip);
    });

    jFrame.add(jLabel);
    jFrame.add(jLabel2);
    jFrame.add(getIpButton);
    jFrame.add(jTextField);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jFrame.setVisible(true);
  }
}
