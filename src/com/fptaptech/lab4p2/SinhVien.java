package com.fptaptech.lab4p2;

public class SinhVien {
    private int maso;
    private String hoten;
    private String sdt;
    private String diachi;

    public SinhVien() {
    }

    public SinhVien(int maso, String hoten, String sdt, String diachi) {
        this.maso = maso;
        this.hoten = hoten;
        this.sdt = sdt;
        this.diachi = diachi;
    }

    public int getMaso() {
        return maso;
    }

    public void setMaso(int maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maso=" + maso +
                ", hoten='" + hoten + '\'' +
                ", sdt='" + sdt + '\'' +
                ", diachi='" + diachi + '\'' +
                '}';
    }
}
