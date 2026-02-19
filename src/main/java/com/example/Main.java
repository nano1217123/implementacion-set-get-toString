package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Demostracion");

        Product p1 = new Product();
        Product p2 = new Product("P123", "Laptop", 40, 12);

        System.out.println("metodo set");
        p1.setPrice(200);

        System.out.println("metodo get producto 1");
        System.out.println(p1.getId());
        System.out.println(p1.getName());

        System.out.println("metodo get producto 2");
        System.out.println(p2.getPrice());
        System.out.println(p2.getName());

        System.out.println("objetos completos: ");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}