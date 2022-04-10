package com.andersenlab;

public class Triangle {
    public double getArea(int a, int b, int c) {
        double p = (double) (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
