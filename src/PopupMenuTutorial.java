import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class PopupMenuTutorial extends BasicJFrame {


  public PopupMenuTutorial(){

    final JPopupMenu jPopupMenu = new JPopupMenu();
    jPopupMenu.add(new JMenuItem("cut"));
    jPopupMenu.add(new JMenuItem("copy"));
    jPopupMenu.add(new JMenuItem("paste"));

    PopupMenuTutorial popupMenuTutorial = this;
    addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        jPopupMenu.show(popupMenuTutorial, e.getX(), e.getY());
      }
    });



    add(jPopupMenu);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    new PopupMenuTutorial();
  }


}
