package com.asgmt1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Tamgiac myTamgiac = new Tamgiac(a, b, c);
        System.out.println("Chu vi tam giac P = " + myTamgiac.getChuvi());
        System.out.println("Dien tich tam giac S = " + myTamgiac.getDientich());
    }
}
