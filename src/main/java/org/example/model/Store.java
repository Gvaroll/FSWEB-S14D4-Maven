package org.example.model;

public class Store {
    public void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[] {
                new Chocolate("Dark", 15.0, "Bitter chocolate", 70),
                new Coke("Classic", 5.0, "Coca Cola 330ml", 330),
                new Bread("Baguette", 7.5, "French bread", true)
        };

        Store store = new Store();
        store.listProducts(products);
    }
}
