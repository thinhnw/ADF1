package com.fptaptech.lab5;

import java.util.Scanner;

public class Person {
    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;

    public Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public Person() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Ten: '" + ten + '\'' +
                ", Gioi tinh: " + gioiTinh +
                ", Ngay sinh: '" + ngaySinh + '\'' +
                ", Dia chi: '" + diaChi + '\'' +
                '}';
    }

    public void nhapThongTin() {

        System.out.println("Nhap thong tin moi...");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ten (" + ten + "): ");
        String newTen = scanner.nextLine();
        if (!newTen.isEmpty()) setTen(newTen);

        System.out.print("Gioi tinh (" + gioiTinh + "): ");
        String newGioiTinh = scanner.nextLine();
        if (!newGioiTinh.isEmpty()) setGioiTinh(newGioiTinh);

        System.out.print("Ngay sinh (" + ngaySinh + "): ");
        String newNgaySinh = scanner.nextLine();
        if (!newNgaySinh.isEmpty()) setNgaySinh(newNgaySinh);

        System.out.print("Dia chi (" + diaChi + "): ");
        String newDiaChi = scanner.nextLine();
        if (!newDiaChi.isEmpty()) setDiaChi(newDiaChi);
    }

    public void inThongTin() {
        System.out.println(toString());
    }
}
