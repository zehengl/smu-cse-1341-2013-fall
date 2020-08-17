import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PatientPanel extends JPanel {
  private JLabel fName;
  private JLabel lName;
  private JTextField fNameField;
  private JTextField lNameField;
  private JPanel personPanel;

  public PatientPanel() {
    this.personPanel = new JPanel();
    personPanel.setLayout(new GridLayout(2, 1));
    fName = new JLabel("First Name:");
    lName = new JLabel("Last Name:");
    fNameField = new JTextField(10);
    lNameField = new JTextField(10);
    personPanel.add(fName);
    personPanel.add(fNameField);
    personPanel.add(lName);
    personPanel.add(lNameField);
    this.add(personPanel);

  }

  public void clearText() {
    this.fNameField.setText("");
    this.lNameField.setText("");
  }

  public String getText() {
    String result = "";
    if (this.fNameField.getText() != "" && this.lNameField.getText() != "")
      result = this.fNameField.getText() + " " + this.lNameField.getText();
    return result;
  }
}
