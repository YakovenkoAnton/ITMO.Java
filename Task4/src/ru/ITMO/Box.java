package ru.ITMO;

public class Box extends Shape{
    private double volume;
    private double freeVol;


    Box (double volume){
        this.volume=volume;
        freeVol=volume;
    }

    boolean add(Shape shape){
        if (freeVol>= shape.getVolume()) {
            freeVol -= shape.getVolume();
            System.out.printf("Shape with volume: %.2f помещается, " +
                    "осталось свободного места в коробке: %.2f из %.2f\n\n",
                    shape.getVolume(),freeVol, volume);
            return true;
        }
        else{
            System.out.printf("Не помещается, осталось свободного места: %.2f\n\n", freeVol);
            return false;
        }
    }

    @Override
    public double getVolume() {
        return volume;
    }
}
