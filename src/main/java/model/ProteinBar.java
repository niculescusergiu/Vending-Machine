package model;

class ProteinBar extends Product {
    public ProteinBar(int id, double price, String productName) {
        super(id, price, productName);
    }

    @Override
    public String examine() {
        return "Product3: " + getProductName() + ", ID: " + getId() + ", Price: " + getPrice();
    }

    @Override
    public String use() {
        return "Using Product 3: " + getProductName();
    }
}