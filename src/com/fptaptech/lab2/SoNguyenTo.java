package com.fptaptech.lab2;
import java.lang.Math;
public class SoNguyenTo {
    private int a;
    SoNguyenTo(int a) {
        this.a = a;
    }
    public boolean isSoNguyenTo(int x) {
        if (x < 2) return false;
        if (x == 2) return true;
        for (int i = 2; i < Math.floor(Math.sqrt(x)); ++i) {
            if (x % i == 0) return false;
        }
        return true;
    }
    public int timSoNguyenToTiepTheo() {
        int b = a + 1;
        while (!isSoNguyenTo(b)) ++b;
        return b;
    }
    public int getA() { return a; }

    public void setA(int newA) {
        if (isSoNguyenTo(newA)) {
            this.a = newA;
        } else {
            System.out.println("khong set");
        }
    }
}
