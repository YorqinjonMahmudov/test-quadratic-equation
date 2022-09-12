package com.epam.rd.autotasks;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public String solve(double a, double b, double c) {
        if (a == 0)
            throw new IllegalArgumentException();

        double discriminant = Math.pow(b, 2) - (4 * a * c);
        if (discriminant < 0)
            return "no roots";
        else if (discriminant > 0) {
            double x1 = (-b + (sqrt(discriminant))) / (2 * a);
            double x2 = (-b - (sqrt(discriminant))) / (2 * a);
            return x1 + " " + x2;
        } else return String.valueOf((-b / 2 * a));

    }

}