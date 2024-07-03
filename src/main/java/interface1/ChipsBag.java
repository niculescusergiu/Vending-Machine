package interface1;

class ChipsBag extends Product {
    public ChipsBag(int id, double price, String productName) {
        super(id, price, productName);
    }

    @Override
    public String examine() {
        return "Product2: " + getProductName() + ", ID: " + getId() + ", Price: " + getPrice();
    }

    @Override
    public String use() {
        return "Using Product 2: " + getProductName();
    }
    public String getDescription() {
        return "A bag of chips";
    }
}