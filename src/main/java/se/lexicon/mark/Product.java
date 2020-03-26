package se.lexicon.mark;

import java.util.ArrayList;
import java.util.List;



// Your task is to make a method that takes a List of Products, a Conditional and an Action as arguments.
// Method should iterate though the List and apply a filter using the Conditional.
// On each Person passing the filter you apply the Action.

public class Product {
    private String productName;
    private double price;
    private int stock;


    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock(int i) {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';

    }


    //constructor
    public Product(String productName, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }
    //method that takes a List of Products, a Conditional and an Action as arguments
      public static List<Product> productOperator(Conditional conditional, Action action, List<Product> productList){
        List<Product> tempProduct = new ArrayList<>();
        for (Product product : productList) {
            if (conditional.test(product)) {  // <--- conditional
                tempProduct.add(product);
                action.execute(product);  // <--- action
            }        }
        return tempProduct;
    }
}



