package com.fptaptech.asgmt2;

public class Fraction {
    private int numerator; // tu so
    private int denominator; // mau so

    Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) return;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }


    public static int GCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int LCM(int a, int b) {
        int gcd = GCD(a, b);
        return (a * b) / gcd;
    }

    public Fraction rutGon() {
        int gcd = GCD(numerator, denominator);
        return new Fraction(numerator / gcd, denominator / gcd);
    }

    public Fraction nghichDao() {
        if (numerator == 0) {
            System.out.println("Khong the nghich dao, tu so dang la 0");
            return this;
        }
        int a = denominator;
        int b = numerator;
        return new Fraction(a, b);
    }

    public static Fraction add(Fraction frOne, Fraction frTwo) {

        int commonDenominator = LCM(frOne.denominator, frTwo.denominator);
        int a = frOne.numerator * (commonDenominator / frOne.denominator);
        int b = frTwo.numerator * (commonDenominator / frTwo.denominator);
        Fraction frRes = new Fraction(a + b, commonDenominator);
        frRes.rutGon();
        return frRes;
    }

    public static Fraction sub(Fraction frOne, Fraction frTwo) {

        int commonDenominator = LCM(frOne.denominator, frTwo.denominator);
        int a = frOne.numerator * (commonDenominator / frOne.denominator);
        int b = frTwo.numerator * (commonDenominator / frTwo.denominator);
        Fraction frRes = new Fraction(a - b, commonDenominator);
        frRes.rutGon();
        return frRes;
    }

    public static Fraction mul(Fraction frOne, Fraction frTwo) {

        Fraction frRes = new Fraction(frOne.numerator * frTwo.numerator,
                frOne.denominator * frTwo.denominator);
        frRes = frRes.rutGon();
        return frRes;
    }

    public static Fraction div(Fraction frOne, Fraction frTwo) {

        Fraction frRes = mul(frOne, frTwo.nghichDao());
        frRes = frRes.rutGon();
        return frRes;
    }

    public static void main(String args[]) {

        Fraction frOne = new Fraction(1, 2);
        Fraction frTwo = new Fraction(2, 3);

        System.out.println(Fraction.add(frOne, frTwo).toString());
    }
}
