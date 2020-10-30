package com.company;

public class Vector2D {
    double a, b;

    Vector2D(double a, double b) {
        super();
        this.a = a;
        this.b = b;

    }
    public Vector2D(Vector2D v){
        this.a = v.a;
        this.b = v.b;

    }
    public Vector2D() {
        this.a = 1.00;
        this.b = 1.00;
    }

    public void print() {
        System.out.println("(" + this.a + "," + this.b + ")");

    }
}
