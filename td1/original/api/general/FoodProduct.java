package original.api.general;
import td1.original.api.general.Product;
public interface FoodProduct extends Product, Calories {
    public default double Calories(){
return weight()/100 * calories_pour_100g();
    }
}
