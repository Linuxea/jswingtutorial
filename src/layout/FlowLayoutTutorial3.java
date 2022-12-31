package layout;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTutorial3 extends JFrame implements ActionListener {

  public FlowLayoutTutorial3() {

    setLayout(new FlowLayout(FlowLayout.LEFT, 20, 25));
    List<JButton> jButtons = generateJButton(9);
    addJButton2JFrame(this, jButtons);
    setSize(400, 400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    new FlowLayoutTutorial3();
  }

  @Override
  public void actionPerformed(ActionEvent e) {

  }

  public List<JButton> generateJButton(Integer num) {
    return IntStream.range(0, num).mapToObj(i -> new JButton(i + "")).collect(Collectors.toList());
  }

  public void addJButton2JFrame(JFrame jFrame, List<JButton> jButtons) {
    Consumer<JButton> addComponent = jFrame::add;
    jButtons.forEach(addComponent);
  }


}
