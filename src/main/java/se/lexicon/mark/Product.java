package se.lexicon.mark;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


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

    public int getStock() {
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
                //", productList=" + productList +
                '}';

    }

    //method that takes a List of Products, a Conditional and an Action as arguments
    //constructor
    public Product(String productName, double price, int stock) {
        this();
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }
    /*Predicate<Product> stringPredicate = (stock) -> stock.setStock();
        if (stringPredicate.(0).Conditional){
        System.out.println("Success");
    }else {
        System.out.println("does not Start with 0");
    }*/

    public List<Product> productList = new ArrayList<>();

    public Product() {

    }
        public void addProducts(){
        productList.add(new Product("Choklad" , 10.50,100));
        productList.add(new Product("Pepsi" , 113.50,0));
        productList.add(new Product("Cheese" , 49.90,50));
        productList.add(new Product("Milk" , 11.50,100));
        productList.add(new Product("Yoggi" , 25.50,0));
        productList.add(new Product("Ham" , 149.00,70));
        productList.add(new Product("Water" , 100,0));
    }

    }


