package com.fptaptech.asgmt3;

import java.math.BigDecimal;

public class Product {
    private int id;
    private String name;
    private int qty;
    private BigDecimal price;

    public Product() {
    }

    public Product(int id, String name, int qty, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        if (qty < 0) {
            System.out.println("Product quantity must be larger than 0.");
            return;
        }
        this.qty = qty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        if (price.compareTo(BigDecimal.ZERO) == -1) {
            System.out.println("Product price must be larger than 0.");
            return;
        }
        this.price = price;
    }
}
