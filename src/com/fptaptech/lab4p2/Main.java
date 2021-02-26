package com.fptaptech.lab4p2;

public class Main {
    public static void main(String args[]) {

        SinhVien a = new SinhVien(1, "Nguyen A", "0123456789", "Ha Noi");
        SinhVien b = new SinhVien(2, "Le B", "0123456799", "Quang Ninh");
        SinhVien c = new SinhVien(3, "Pham C", "0123456989", "Nghe An");

        LopHoc lophoc = new LopHoc(1, "T2008M", "A8");
        lophoc.themSinhVien(a);
        lophoc.themSinhVien(b);
        lophoc.themSinhVien(c);

        lophoc.printDsSinhVien();
    }
}
