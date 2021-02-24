package com.fptaptech.asgmt3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    private int id;
    private String customerName;
    private String city;
    private BigDecimal grandTotal;
    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
        grandTotal = BigDecimal.ZERO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addProduct(Product p) {
        this.products.add(p);
        this.grandTotal.add(p.getPrice());
    }

    public void removeProduct(Product p) {
        this.products.remove(p);
        this.grandTotal.subtract(p.getPrice());
    }

    public BigDecimal getGrandTotal() {
        switch(city) {
            case "HN":
            case "HCM":
                return grandTotal.add(grandTotal.divide(new BigDecimal(100)));
            default:
                return grandTotal.add(grandTotal.multiply(new BigDecimal(2)).divide(new BigDecimal(100)));
        }
    }
}
