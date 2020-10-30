package com.company;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Fraction f = new Fraction(3, 5);
        Fraction f1 = new Fraction(7);
        Fraction f2 = new Fraction();
        //System.out.println( f.a + "/" + f.b);
        f.print();
        f1.print();
        f2.print();
        System.out.println(Fraction.count);
        System.out.println(Fraction.div(6, 3));
    }
}
