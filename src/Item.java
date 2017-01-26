/**
 * Created by Sagar on 1/17/2017.
 */
 public class Item {
    private String name;
    private double price;


    Item(){

    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;

    }

    public double priceFor(int quantity) {
        return price * quantity;
    }

    @Override
    public String toString() {
        return name + ",$" + String.format("%.2f", price);
    }



}






