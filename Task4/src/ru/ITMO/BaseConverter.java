package ru.ITMO;

public class BaseConverter {

    static void convert(double cels){
        System.out.printf("%.2f °C = %.2f °K = %.2f °F\n\n", cels, cels+273.15, 9*cels/5+32);
    }
}
