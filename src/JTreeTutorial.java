import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeTutorial extends JFrame {

  public JTreeTutorial() {

    setSize(400, 400);
    setTitle("hello " + this.getClass().getSimpleName());

    DefaultMutableTreeNode root = new DefaultMutableTreeNode("/");

    DefaultMutableTreeNode home = new DefaultMutableTreeNode("home");
    DefaultMutableTreeNode linuxea = new DefaultMutableTreeNode("linuxea");
    DefaultMutableTreeNode summer = new DefaultMutableTreeNode("summer");
    home.add(linuxea);
    home.add(summer);
    root.add(home);

    DefaultMutableTreeNode bin = new DefaultMutableTreeNode("bin");
    root.add(bin);

    DefaultMutableTreeNode etc = new DefaultMutableTreeNode("etc");
    root.add(etc);

    JTree jTree = new JTree(root);
    add(jTree);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    new JTreeTutorial();
  }

}
