package model;

public class App {
    public static void main(String[] args) {
        Product product1 = new ChipsBag(1, 20, "Chips Bag");
        Product product2 = new ProteinBar(2, 10, "Protein Bar");
        Product product3 = new CocaCola(3, 15, "Coca Cola");

        System.out.println(product1.examine());
        System.out.println(product1.use());

        System.out.println(product2.examine());
        System.out.println(product2.use());

        System.out.println(product3.examine());
        System.out.println(product3.use());
    }
}