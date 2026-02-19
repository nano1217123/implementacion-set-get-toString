package com.example;

public class Product {

    private String id;
    private String name;
    private double price;
    private int stock;

    // Default constructor
    public Product() {
        this.id = "";
        this.name = "";
        this.price = 0.0;
        this.stock = 0;
    }

    // Parameterized constructor
    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        setPrice(price);
        setStock(stock);
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Setters 
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Stock cannot be negative.");
        }
    }

    public String toString() {
        return String.format(
                "Product Details:%n" +
                "ID: %s%n" +
                "Name: %s%n" +
                "Price: $%.2f%n" +
                "Stock: %d units",
                id, name, price, stock
        );
    }
}
