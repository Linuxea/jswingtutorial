import javax.swing.JFrame;

public abstract class BasicJFrame extends JFrame {

  public BasicJFrame(){
    setLayout(null);
    setSize(400, 400);
    setTitle("hello " + this.getClass().getSimpleName());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}
