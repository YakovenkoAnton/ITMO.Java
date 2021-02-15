package ru.ITMO;

public abstract class SolidOfRevolution extends Shape {
    double radius;

    SolidOfRevolution(double radius) {
        this.radius=radius;
    }

    double getRadius(){
        return radius;
    }
}
