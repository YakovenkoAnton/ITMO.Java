package ru.ITMO;

public class Pyramid extends Shape {
    private double height;
    private double s;

    Pyramid(double height, double s) {
        this.height=height;
        this.s=s;
        System.out.printf("Created PYRAMID height: %.2f s: %.2f volume: %.2f\n", height, s, getVolume());
    }

    @Override
    double getVolume() {
        return s*height/3;
    }
}
