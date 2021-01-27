package com.t2008m;

public class Main {

    public static void main(String[] args) {

        Product productA = new Product(1, "Bút Bi", 10, 5, "Chiếc");
        Product productB = new Product(2, "Bút Chì", 9, 0, "Chiếc");
        Product productC = new Product(3, "Mực", 20, 10, "Lọ");

        productA.showInfo();
        productB.showInfo();
        productC.showInfo();
    }
}
