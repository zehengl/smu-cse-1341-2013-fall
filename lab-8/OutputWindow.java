import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class OutputWindow extends JFrame {
  private JTextArea output;
  private JScrollPane scrollPane;

  public OutputWindow() {
    this.setTitle("Daily Activity Log");
    this.output = new JTextArea(450, 300);
    this.output.setEditable(false);
    this.scrollPane = new JScrollPane(output);
    this.setLayout(new BorderLayout());
    this.add(scrollPane, BorderLayout.CENTER);
  }

  public void setText(String s) {
    output.setText(output.getText() + "\n" + s);
  }
}
