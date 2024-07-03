package interface1;

public class VendingMachineImpl implements VendingMachine {
    private final Product[] products;
    private int depositPool;

    public VendingMachineImpl(Product[] products) {
        this.products = products;
        this.depositPool = 0;
    }

    @Override
    public void addCurrency(int amount) {
        depositPool += amount;
    }

    @Override
    public int getBalance() {
        return depositPool;

    }

    @Override
    public Product request(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                if (depositPool >= product.getPrice()) {
                    depositPool -= product.getPrice();
                    return product;
                } else {
                    System.out.println("Insufficient balance");
                    return null;
                }
            }
        }
        System.out.println("Product not found");
        return null;
    }


    @Override
    public int endSession() {
        int balance = depositPool;
        depositPool = 0;
        return balance;
    }

    @Override
    public String getDescription(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product.getDescription();
            }
        }
        return "Product not found";
    }


    @Override
    public String[] getProducts() {
        String[] productNames = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            productNames[i] = products[i].getProductName();
        }
        return productNames;
    }
}