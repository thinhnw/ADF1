package com.fptaptech.lab1;

import java.math.BigDecimal;

public class Product {

    private int id;
    private String name;
    private BigDecimal price;
    private int qty;
    private String unitName;

    public Product(int id, String name, double price, int qty, String unitName) {
        this.id = id;
        this.name = name;
        this.price = new BigDecimal(price);
        this.qty = qty;
        this.unitName = unitName;
    }

    public void increaseQty(int amount) {
        this.qty += amount;
    }
    public void decreaseQty(int amount) {
        if (this.qty >= amount) {
            this.qty -= amount;
        } else {
            System.out.println("The amount to decrease is larger than the current quantity");
        }
    }

    public void setPrice(double newPrice) {

        this.price = new BigDecimal(newPrice);
    }

    public boolean isInStock() {
        return (this.qty > 0);
    }

    public void showInfo() {
        System.out.println(id + ": " + name + " " + price + ".000VND " + qty + " " + unitName);
    }
}
