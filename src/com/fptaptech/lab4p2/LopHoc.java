package com.fptaptech.lab4p2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class LopHoc {
    private int malop;
    private String tenlop;
    private String phonghoc;
    private List<SinhVien> dsSinhVien;

    public LopHoc(int malop, String tenlop, String phonghoc) {
        this.malop = malop;
        this.tenlop = tenlop;
        this.phonghoc = phonghoc;
        dsSinhVien = new ArrayList<>();
    }

    public LopHoc() {
        dsSinhVien = new ArrayList<>();
    }

    public int getMalop() {
        return malop;
    }

    public void setMalop(int malop) {
        this.malop = malop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public String getPhonghoc() {
        return phonghoc;
    }

    public void setPhonghoc(String phonghoc) {
        this.phonghoc = phonghoc;
    }

    public void themSinhVien(SinhVien sv) {
        dsSinhVien.add(sv);
    }

    public void xoaSinhVien(SinhVien sv) {
        dsSinhVien.remove(sv);
    }

    public void printDsSinhVien() {
        System.out.println("Danh sach sinh vien cua lop " + tenlop + " gom:");
        dsSinhVien.forEach(sv -> {
            System.out.println(sv.toString());
        });
    }
}
