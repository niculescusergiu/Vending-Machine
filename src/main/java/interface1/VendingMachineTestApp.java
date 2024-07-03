package interface1;


public class VendingMachineTestApp {
    public static void main(String[] args) {
        Product[] products = {
                new ChipsBag(1, 35, "Lays Barbeque"),
                new CocaCola(2, 20, "Coca-Cola"),
                new ProteinBar(3, 25, "Barbells Chocolate")
        };
        VendingMachine vendingMachine = new VendingMachineImpl(products);
        vendingMachine.addCurrency(200);
        System.out.println("Balance after input:" + vendingMachine.getBalance());

        System.out.println("Description of product 1: "+ vendingMachine.getDescription(1));
        System.out.println("Description of product 2: "+ vendingMachine.getDescription(2));
        System.out.println("Description of product 3: "+ vendingMachine.getDescription(3));

        Product requestedProduct = vendingMachine.request(1);
        if (requestedProduct != null) {
            System.out.println("Requested product: " + requestedProduct.getProductName());
        }
        System.out.println("Balance after request: " + vendingMachine.getBalance());


        requestedProduct = vendingMachine.request(2);
        System.out.println("Requested product: " + requestedProduct.getProductName());
        System.out.println("Balance after request: " + vendingMachine.getBalance());
        if (requestedProduct == null) {
            System.out.println("Insufficient balance for request");
        }


        int remainingBalance = vendingMachine.endSession();
        System.out.println("Balance after ending session: " + vendingMachine.getBalance());

        String[] productNames = vendingMachine.getProducts();
        System.out.println("Available products:");
        for (String name : productNames) {
            System.out.println("- " + name);
        }
    }


}
