package com.company;

import java.math.RoundingMode;
import java.util.Locale;

public class Vector2D {
    double a, b;

    Vector2D(double a, double b) {
        super();
        this.a = a;
        this.b = b;

    }

    public Vector2D(Vector2D v) {
        this.a = v.a;
        this.b = v.b;

    }

    public Vector2D() {
        this.a = 1.00;
        this.b = 1.00;
    }

    public double length() {
        double len = (Math.sqrt(this.a * this.a + this.b * this.b));
        return len;
    }

    public Vector2D add(Vector2D v) {
        return new Vector2D(this.a + v.a, this.b + v.b);

    }

    public Vector2D sub(Vector2D v) {
        return new Vector2D(this.a + v.a, this.b + v.b);

    }

    public Vector2D scale(double scalefactor) {
        return new Vector2D(this.a * scalefactor, this.b * scalefactor);

    }
    public void print() {
        System.out.print("(");
        System.out.printf("%.2f", this.a);
        System.out.print(", ");
        System.out.printf("%.2f", this.b);
        System.out.println(")");

    }
}
