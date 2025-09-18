package org.example.model;

public class Bread extends ProductForSale {
    private boolean wholeGrain;

    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.wholeGrain = false; // varsayılan değer
    }

    public Bread(String type, double price, String description, boolean wholeGrain) {
        super(type, price, description);
        this.wholeGrain = wholeGrain;
    }

    public boolean isWholeGrain() {
        return wholeGrain;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread: " + getType() + ", Price: " + getPrice() +
                ", Description: " + getDescription() + ", Whole grain: " + wholeGrain);
    }
}
