package interface1;

class CocaCola extends Product {
    public CocaCola(int id, double price, String productName) {
        super(id, price, productName);
    }

    @Override
    public String examine() {
        return "Product1: " + getProductName() + ", ID: " + getId() + ", Price: " + getPrice();
    }

    @Override
    public String use() {
        return "Using Product 1: " + getProductName();
    }
    public String getDescription() {
        return "A bottle of coke";
    }
}