package org.example;

public class Product {
    private int id;
    private String name;
    private String category;
    private int quantity;
    private int price;

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    private int quantitySold = 0;

    public Product(int id, String name, String category, int quantity, int price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public void soldItem() {
        if(this.quantity > 0) {
            this.quantity--;
            this.quantitySold++;
        }
    }
}
