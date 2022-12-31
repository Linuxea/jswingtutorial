package layout;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutTutorial extends JFrame {

  public BoxLayoutTutorial() {

    List<JButton> jButtons = generateJButton(9);
    addJButton2JFrame(this, jButtons);
    getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
    setSize(400, 400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    new BoxLayoutTutorial();
  }

  public List<JButton> generateJButton(Integer num) {
    return IntStream.range(0, num).mapToObj(i -> new JButton(i + "")).collect(Collectors.toList());
  }

  public void addJButton2JFrame(JFrame jFrame, List<JButton> jButtons) {
    Consumer<JButton> addComponent = jFrame::add;
    jButtons.forEach(addComponent);
  }
}
