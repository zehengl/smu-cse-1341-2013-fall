
import java.util.Random;
import java.util.ArrayList;

public class Spinner {
  private Random randomMaker = new Random();
  private ArrayList<FoodItem> foods;

  public Spinner() {
    foods = new ArrayList<FoodItem>();
    foods.add(new Fruit("Orange"));
    foods.add(new Vegetable("Spinach"));
    foods.add(new Fruit("Apple"));
    foods.add(new Fruit("Strawberry"));
    foods.add(new Fruit("Pear"));
    foods.add(new Vegetable("Cucumber"));
    foods.add(new Sweet("Donut"));
    foods.add(new Vegetable("Broccoli"));

  }

  public FoodItem spin() {
    int x = randomMaker.nextInt(8);
    return foods.get(x);
  }

}
