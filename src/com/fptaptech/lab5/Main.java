package com.fptaptech.lab5;

public class Main {
    public static void main(String args[]) {

        Person personOne = new Person("Nguyen A", "Nam", "01-01-1990", "Hanoi");

//        personOne.nhapThongTin();
//        personOne.inThongTin();

        Student student = new Student("Pham M", "Nam", "12-12-1989", "HCM");
        student.nhapThongTin();
        student.inThongTin();
    }
}
