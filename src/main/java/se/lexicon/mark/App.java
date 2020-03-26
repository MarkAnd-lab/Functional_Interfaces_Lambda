package se.lexicon.mark;

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

        Conditional outOfStock = (Product p) -> p.getStock(1) == 0; //
        System.out.println("This products are out of stock:");
        Product.productOperator(outOfStock,print,newProducts);

        Conditional priceRange100To150 = (Product p) -> p.getPrice() > 100 && p.getPrice() > 150;
        System.out.println("This products are between 100 and 150 price range:");
        Product.productOperator(priceRange100To150, print , newProducts);

        Action priceIncrease = (Product p) -> p.setPrice((p.getPrice())*1.5 * 10/10);
        Conditional lowStock = (Product p) -> p.getStock(0) < 10 && p.getStock(10) > 0;
        System.out.println("This products are out of stock:");
        Product.productOperator(outOfStock,print,newProducts);

        System.out.println("This products had price increased:");
        List<Product> newPriceProducts = Product.productOperator(lowStock,priceIncrease,newProducts);
        for (Product p : newPriceProducts) {
            System.out.println(p.toString());
        }

    }

}

