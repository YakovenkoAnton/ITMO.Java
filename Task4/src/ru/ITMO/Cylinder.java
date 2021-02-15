package ru.ITMO;

public class Cylinder extends SolidOfRevolution{
    private double height;

    Cylinder(double radius, double height) {
        super(radius);
        this.radius=radius;
        this.height=height;
        System.out.printf("Created CYLINDER radius: %.2f height: %.2f volume: %.2f\n", radius,height, getVolume());
    }

    @Override
    double getVolume(){
        return Math.PI*Math.pow(radius,2)*height;
    }


}
