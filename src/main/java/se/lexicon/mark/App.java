package se.lexicon.mark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

            // Skapa lambda funktioner efter att man skapat en method

               List<Product> newProducts = Arrays.asList(
                new Product("B_Chocolate" , 10.50,100),
                new Product("Pepsi" , 113.50,0),
                new Product("B_Cheese" , 49.90,50),
                new Product("Milk" , 11.50,100),
                new Product("B_Yoghurt" , 25.50,0),
                new Product("Ham" , 149.00,70),
                new Product("Water" , 100,0)
        );
       /* You will have to make Lambda Implementations to help you accomplish the following scenarios.
• Print out all Products that have stock value of 0.
• Print out the productName of all the Products that starts with B.
• Print out all Products that have price above 100 AND lower than 150
• Increase the price of all Products that have a stock value of less than 10 AND above 0 by 50%
*/


        Action print = (Product p) -> System.out.println(p.toString());
        Conditional startsWithB = (Product p) -> p.getProductName().startsWith("B");
        System.out.println("This products Start with B:");
        Product.productOperator(startsWithB , print , newProducts);
           }

}

