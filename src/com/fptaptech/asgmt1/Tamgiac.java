package com.fptaptech.asgmt1;
import java.lang.Math;

public class Tamgiac {

    private double sideA;
    private double sideB;
    private double sideC;

    public Tamgiac(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public boolean isTamgiac() {
        return !(sideA + sideB <= sideC) && !(sideB + sideC <= sideA) && !(sideC + sideA <= sideB);
    }

    public double getChuvi() {
        return sideA + sideB + sideC;
    }

    public double getDientich() {

        double p = getChuvi() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}
