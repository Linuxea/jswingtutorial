package layout;


import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.EAST;
import static java.awt.BorderLayout.NORTH;
import static java.awt.BorderLayout.SOUTH;
import static java.awt.BorderLayout.WEST;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTutorial extends JFrame implements ActionListener {

  public BorderLayoutTutorial() {

    JButton east = new JButton("east");
    east.addActionListener(this);
    JButton south = new JButton("south");
    south.addActionListener(this);
    JButton north = new JButton("north");
    north.addActionListener(this);
    JButton west = new JButton("west");
    west.addActionListener(this);
    JButton center = new JButton("center");
    center.addActionListener(this);

    setLayout(new BorderLayout(20, 15));
    add(east, EAST);
    add(south, SOUTH);
    add(north, NORTH);
    add(west, WEST);
    add(center, CENTER);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(400, 400);
    setVisible(true);
  }

  public static void main(String[] args) {
    new BorderLayoutTutorial();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JButton source = (JButton) e.getSource();
    source.setText("点我");
    source.setBackground(Color.green);
  }
}
