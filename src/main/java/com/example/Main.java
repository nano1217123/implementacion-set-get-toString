package com.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Product Demonstration ===\n");

        // Create products
        Product product1 = new Product();
        Product product2 = new Product("P123", "Laptop", 40.0, 12);

        // Modify product1 using setters
        product1.setId("P001");
        product1.setName("Smartphone");
        product1.setPrice(200.0);
        product1.setStock(25);

        // getters
        System.out.println("Product 1 Information (Using Getters):");
        System.out.println("ID: " + product1.getId());
        System.out.println("Name: " + product1.getName());
        System.out.println("Price: $" + product1.getPrice());
        System.out.println("Stock: " + product1.getStock());
        System.out.println();

        System.out.println("Product 2 Information (Using Getters):");
        System.out.println("ID: " + product2.getId());
        System.out.println("Name: " + product2.getName());
        System.out.println("Price: $" + product2.getPrice());
        System.out.println("Stock: " + product2.getStock());
        System.out.println();

        // toString()
        System.out.println("=== Using toString() ===");
        System.out.println(product1);
        System.out.println();
        System.out.println(product2);
    }
}
