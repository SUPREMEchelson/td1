package td1.original.api.general;

import original.api.general.Calories;
import original.api.general.FoodProduct;

import java.util.List;

public class Burger implements Product, Calories, FoodProduct {

    String name;
    List<Product> items;

    public Burger(String name, List<Product> items) {
        this.name = name;
        this.items = items;
    }

    @Override
    public double weight() {
            return items.stream().map(Product::weight).reduce(0.0, Double::sum);
    }

    @Override
    public double price() {
        return items.stream().map(Product::price).reduce(0.0, Double::sum);
    }

    @Override
    public double calories_pour_100g() {return Calories()/ weight() * 100;}


    @Override
    public String toString() {
        final String DELIM = "--------------------\n";
        StringBuilder buffer = new StringBuilder();
        buffer.append(String.format("*** Menu %s ***\n", name));
        for (Object item : items) {
            buffer.append(String.format("- %s\n", item));
        }
        buffer.append(DELIM);
        buffer.append(String.format("price:         %.2f\n", price()));
        buffer.append(DELIM);
        return buffer.toString();
    }
}
