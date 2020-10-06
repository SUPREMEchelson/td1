package td1.step1.api.general;

public class Cheddar implements FoodProduct {
    // 400 kcal / 100g

    private double weight;
    private double BASE_PRICE = 4;
    // pr le burger
    public double calories(){ return items.stream().map(FoodProduct::calories).reduce(0.0,double::sum);
    }

    public Cheddar(double weight) {
        this.weight = weight;
    }
    @Override
    public double calories_par_100g(){
        return calories()/ weight()*100;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double price() {
        return BASE_PRICE * weight / 100;
    }

    @Override
    public String toString() {
        return String.format("cheddar (%.0fg) -- %.2f€", weight(), price());
    }
}
