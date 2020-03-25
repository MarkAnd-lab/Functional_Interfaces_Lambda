package se.lexicon.mark;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Practice" );

        Product product = new Product();
        product.addProducts();
        System.out.println("All Products that have stock value of 0: \n" + product);
    }
    // Skapa lambda funktioner efter att man skapat en method
}
