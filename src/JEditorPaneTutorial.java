import javax.swing.JEditorPane;

public class JEditorPaneTutorial extends BasicJFrame {

  public JEditorPaneTutorial() {
    JEditorPane jEditorPane = editorPane();
    setContentPane(jEditorPane);
    setVisible(true);
  }

  public static void main(String[] args) {
    new JEditorPaneTutorial();
  }

  public JEditorPane editorPane() {
    JEditorPane jEditorPane = new JEditorPane();
    jEditorPane.setContentType("text/html");
    jEditorPane.setText("<h1>Sleeping</h1><p>Sleeping is necessary for a healthy body."
        + " But sleeping in unnecessary times may spoil our health, wealth and studies."
        + " Doctors advise that the sleeping at improper timings may lead for obesity during the students days.</p>");
    return jEditorPane;
  }
}
