import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class ServicePanel extends JPanel {
  private JPanel sectionPanel;
  private JCheckBox[] checkboxes;

  public ServicePanel(ArrayList<String> list) {
    int size = list.size();
    checkboxes = new JCheckBox[size];
    this.sectionPanel = new JPanel();
    sectionPanel.setLayout(new BoxLayout(sectionPanel, BoxLayout.Y_AXIS));
    for (int i = 0; i < size; i++) {
      checkboxes[i] = new JCheckBox(list.get(i));
      sectionPanel.add(checkboxes[i]);
    }
    this.add(sectionPanel);
  }

  public boolean isSelected(int i) {
    if (checkboxes[i].isSelected())
      return true;
    else
      return false;
  }

  public void clear() {
    for (int i = 0; i < checkboxes.length; i++)
      checkboxes[i].setSelected(false);
  }

}
