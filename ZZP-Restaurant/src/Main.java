import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Pizza 1
        Pizza.PizzaBuilder pizzaBuilder = new Pizza.PizzaBuilder(Pizza.PizzaSize.Small, Pizza.Sauce.Tomato);
        pizzaBuilder.addIngredient(Pizza.Ingredient.Cheese);
        pizzaBuilder.addIngredient(Pizza.Ingredient.Ham);
        pizzaBuilder.addIngredient(Pizza.Ingredient.Pepper);

        Pizza firstPizza = pizzaBuilder.build();
        System.out.print(firstPizza.toString());
    }
}
