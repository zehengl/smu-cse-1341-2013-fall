import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DentalOffice {

  private ArrayList<Double> costs;

  public DentalOffice(ArrayList<String> choices, ArrayList<String> services) {
    Scanner s;
    ArrayList<Double> default_costs = new ArrayList<Double>();
    try {
      s = new Scanner(new File("costs.cfg"));
      while (s.hasNextDouble())
        default_costs.add(s.nextDouble());

    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    costs = new ArrayList();
    for (int i = 0; i < choices.size(); i++)
      for (int j = 0; j < services.size(); j++) {
        if (choices.get(i).equals(services.get(j)))
          costs.add(default_costs.get(j));

      }

  }

  public double getCost() {
    double result = 0;
    for (int i = 0; i < costs.size(); i++)
      result += costs.get(i);
    return result;
  }

}
