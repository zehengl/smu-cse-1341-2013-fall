import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class DentalOfficeWindow extends JFrame implements ActionListener, ItemListener {

  private ArrayList<String> services;
  private ArrayList<String> durations;
  private JPanel durationPanel;
  private JPanel sectionPanel;
  private JRadioButton[] jrbuttons;
  private JButton calcButton;
  private JLabel returnLabel;
  private JLabel messageLabel;
  private ImageIcon officeImage;
  private double total;
  private String returnTime;
  private ButtonGroup group1;

  private ServicePanel servicePanel;
  private OutputWindow outFrame;
  private DentalOffice office;
  private PatientPanel patientPanel;

  public DentalOfficeWindow() {
    this.setTitle("SMU Dental Services");
    this.setLayout(new BorderLayout());

    this.sectionPanel = new JPanel();
    sectionPanel.setLayout(new FlowLayout());
    this.messageLabel = new JLabel("Please provide name, check activities, and select duration");
    this.calcButton = new JButton("Calculate Bill");
    sectionPanel.add(messageLabel);
    sectionPanel.add(calcButton);
    this.add(sectionPanel, BorderLayout.SOUTH);

    this.patientPanel = new PatientPanel();
    this.add(patientPanel, BorderLayout.EAST);

    Scanner s;
    services = new ArrayList<String>();
    try {
      s = new Scanner(new File("services.cfg"));
      while (s.hasNextLine())
        services.add(s.nextLine());
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    this.servicePanel = new ServicePanel(services);
    this.add(servicePanel, BorderLayout.WEST);

    durations = new ArrayList<String>();

    try {
      s = new Scanner(new File("durations.cfg"));
      while (s.hasNextLine())
        durations.add(s.nextLine());
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    this.returnLabel = new JLabel("Return in ");
    this.durationPanel = new JPanel();
    this.group1 = new ButtonGroup();
    durationPanel.setLayout(new FlowLayout());
    durationPanel.add(returnLabel);
    jrbuttons = new JRadioButton[3];
    for (int i = 0; i < 3; i++) {
      jrbuttons[i] = new JRadioButton(durations.get(i));
      durationPanel.add(jrbuttons[i]);
      jrbuttons[i].addItemListener(this);
      group1.add(jrbuttons[i]);
    }
    this.add(durationPanel, BorderLayout.NORTH);

    this.officeImage = new ImageIcon("dentalOffice.png");
    this.add(new JLabel(officeImage), BorderLayout.CENTER);

    this.outFrame = new OutputWindow();
    outFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    outFrame.setSize(480, 300);
    outFrame.setResizable(false);
    outFrame.setVisible(true);

    returnTime = "";
    total = 0;
    this.calcButton.addActionListener(this);

  }

  public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == this.calcButton) {
      setMessage();
    }
  }

  public void itemStateChanged(ItemEvent ie) {
    if (ie.getStateChange() == ItemEvent.SELECTED) {
      JRadioButton jrb = (JRadioButton) ie.getSource();
      returnTime = jrb.getText();
    }
  }

  public void setMessage() {
    String name = this.patientPanel.getText();
    if (name != "" && returnTime != "") {
      ArrayList<String> choices = new ArrayList<String>();
      for (int i = 0; i < services.size(); i++) {
        if (this.servicePanel.isSelected(i)) {
          choices.add(services.get(i));
        }
      }
      if (choices.size() > 0) {
        this.office = new DentalOffice(choices, services);
        total = office.getCost();
        this.outFrame.setText(name + ": Total cost=$" + total + " return in " + returnTime);
        this.messageLabel.setText("Total cost:" + total + " and return in " + returnTime);
        this.servicePanel.clear();
        this.patientPanel.clearText();
      }
    }

  }

}
