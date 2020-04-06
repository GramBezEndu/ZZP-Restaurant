import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class Pizza {
    public enum PizzaSize {
        Small,
        Medium,
        Large
    }
    public enum Sauce {
        Tomato,
        Creamy
    }
    public enum Ingredient{
        Ham,
        Champignons,
        Onion,
        Pepper,
        Sausage,
        Cheese
    }
    public enum PizzaStyle {
        NewYork,
        CalzoneSauceInside,
        CalzoneSauceOutside
    }

    private Sauce pizzaBase;
    private PizzaSize size;
    private PizzaStyle style;
    private List<Ingredient> ingredients;
    public static class PizzaBuilder {
        private Sauce pizzaBase;
        private PizzaSize size;
        private final List<Ingredient> ingredients = new ArrayList<Ingredient>();
        private PizzaStyle style = PizzaStyle.NewYork;

        public PizzaBuilder(PizzaSize size, Sauce pizzaBase) {
            this.size = size;
            this.pizzaBase = pizzaBase;
        }

        public PizzaBuilder addIngredient(Ingredient ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public PizzaBuilder addIngredient(List<Ingredient> ingredients) {
            this.ingredients.addAll(ingredients);
            return this;
        }

        public PizzaBuilder setStyle(PizzaStyle style) {
            this.style = style;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }
    private Pizza(PizzaBuilder pizzaBuilder) {
        this.pizzaBase = pizzaBuilder.pizzaBase;
        this.size = pizzaBuilder.size;
        this.ingredients = pizzaBuilder.ingredients;
        this.style = pizzaBuilder.style;
    }
    public String toString() {
        String result = "Pizza info:\n\n";
        result += "Base: " + pizzaBase.toString() + '\n';
        result += "Size: " + size.toString() + '\n';
        result += "Ingredients: \n";
        for (var ingredient: ingredients) {
            result += '\t' + ingredient.toString() + '\n';
        }
        result += "Style: " + style.toString() + '\n';
        return result;
    }
}
