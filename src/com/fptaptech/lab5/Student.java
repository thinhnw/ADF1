package com.fptaptech.lab5;

import java.util.Scanner;

public class Student extends Person {

    private String maSV;
    private double diemThi;
    private String email;

    public Student(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        super(ten, gioiTinh, ngaySinh, diaChi);
    }

    public Student() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(double diemThi) {
        this.diemThi = diemThi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Ten: '" + getTen() + '\'' +
                ", Gioi tinh: " + getGioiTinh() +
                ", Ngay sinh: '" + getNgaySinh() + '\'' +
                ", Dia chi: '" + getDiaChi() + '\'' +
                ", Ma SV: " + maSV +
                ", Diem Thi: " + diemThi +
                ", email: " + email +
                '}';
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ma SV (" + maSV + "): ");
        String newMaSV = scanner.nextLine();
        if (!newMaSV.isEmpty()) setMaSV(newMaSV);

        System.out.print("Diem thi (" + diemThi + "): ");
        String newDiemThiInput = scanner.nextLine();
        if (!newDiemThiInput.isEmpty()) {
            Double newDiemThi = Double.parseDouble(newDiemThiInput);
            if (!newDiemThi.isNaN()) setDiemThi(newDiemThi);
        }

        System.out.print("Email (" + email + "): ");
        String newEmail = scanner.nextLine();
        if (!newEmail.isEmpty()) setEmail(newEmail);
    }

    @Override
    public void inThongTin() {
        System.out.println(toString());
    }

    public boolean hasHocBong() {
        return diemThi > 8.0;
    }
}
