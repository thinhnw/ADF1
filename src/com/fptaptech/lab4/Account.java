package com.fptaptech.lab4;

public class Account {
    private int id;
    private String name;
    private int balance;

    public Account() {
    }

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
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

    public int getBalance() {
        return balance;
    }

    public boolean credit(int amount) {
        if (amount <= 0) {
            System.out.println("So tien nap vao phai lon hon 0");
            return false;
        }
        balance += amount;
        System.out.println("So du hien tai cua " + name + " la " + balance);
        return true;
    }

    public boolean debit(int amount) {
        if (balance < amount) {
            System.out.println("Thanh toan khong thanh cong");
            return false;
        }
        balance -= amount;
        System.out.println("So du hien tai cua " + name + " la " + balance);
        return true;
    }

    public boolean transferTo(Account account, int amount) {
        if (this.debit(amount)) {
            account.credit(amount);
            return true;
        }
        System.out.println("Giao dich khong thanh cong.");
        return false;
    }

    public static void main(String args[]) {
        Account accOne = new Account(1, "Barney Stinson", 1000);
        Account accTwo = new Account(2, "Marshall Eriksen", 0);

        accOne.credit(100);
        accTwo.credit(200);

        accOne.transferTo(accTwo, 999);
    }
}
