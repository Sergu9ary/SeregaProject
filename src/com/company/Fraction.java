package com.company;

public class Fraction {
    int a, b;
    static int count;
    static double div(double x, double y){
        return x / y;
    }
    Fraction(int a, int b){
        super();
        this.a = a;
        this.b = b;
        count ++;
    }
    public Fraction(int a){
        this.a = a;
        this.b = 1;
        count ++;
    }

    public Fraction() {
       count++;
    }
    public void  print(){
        System.out.println(this.a + "/" + this.b);
    }
    /*public String toString(){
        return this.a + "/" + this.b;
    }*/
}