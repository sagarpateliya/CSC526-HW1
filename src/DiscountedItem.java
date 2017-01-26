/**
 * Created by Sagar on 1/21/2017.
 */
public class DiscountedItem extends Item {
    private String name;
    private double price;
    private int bulkQuantity;
    private double bulkPrice;

    public DiscountedItem(String name, double price, int bulkQuantity, double bulkPrice) {
        this.name = name;
        this.price = price;
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice;
    }

    @Override
    public String toString() {
        return name + ",$" + String.format("%.2f", price) + "(" + bulkQuantity + " for $" + String.format("%.2f", bulkPrice + ")");
    }
}

