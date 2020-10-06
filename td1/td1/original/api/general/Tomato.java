package td1.original.api.general;

public class Tomato implements Product {

    private double weight;
    private double BASE_PRICE = 0.5;
    private double CALORIE = 21;

    public Tomato(double weight) {
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight;
    }
    @Override
    public double getCALORIE(){return CALORIE;}

    @Override
    public double price() {
        return BASE_PRICE * weight / 100;
    }

    @Override
    public String toString() {
        return String.format("tomato, qty: %.0f -- %.2f", weight(), price());
    }
}



