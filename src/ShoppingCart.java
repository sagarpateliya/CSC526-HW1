import java.util.ArrayList;
import java.util.List;

///**
// * Created by Sagar on 1/21/2017.
// */
     public class ShoppingCart {
    List<Purchase> items;
    private int Item;
    private double total;
    private int quantity;
    private int purchases;
    private double price;
    private static double DiscountPercentage = 10;
    private int DiscountQuantity;
    private char C;
    private boolean Discount;



    public ShoppingCart() {
    items=new ArrayList<>();
    }




    public  void add(int purchase) {
        this.purchases = purchase;
    }

    private void clearall() {
    items.clear();
    }


public static double getDiscountPercentage() {

     return DiscountPercentage;
    }
    public  int  getDiscountQuantity(){
    return DiscountQuantity;
    }

    private double getTotal(){
    return price * quantity;
    }


public boolean  hasDiscount() {
     return  Discount ;
}

public  void  setDiscount (boolean value) {                                 //setting a discount

            Discount =  value ;
    }

    private int totalQuantity (){
    return purchases;
}}
