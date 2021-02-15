package ru.ITMO;

public class Ball extends SolidOfRevolution {
    private double radius;

    Ball(double radius) {
        super(radius);
        this.radius=radius;
        System.out.printf("Created BALL radius: %.2f volume: %.2f\n", radius, getVolume());
    }

    @Override
    double getVolume() {
        return Math.PI * Math.pow(radius, 3) / 3;
    }

}
