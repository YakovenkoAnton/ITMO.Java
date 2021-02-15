package com.company;

public class Main {

    public static void main(String[] args) {
        double min=0, max=10, errorStep=0.001;
        findRoot(min, max, errorStep);
    }

    public static double func(double x){

        return Math.cos(Math.pow(x,5)) + Math.pow(x,4) - 345.3*x -23;
    }

    public static void findRoot(double min, double max, double errorStep){
        double mid=0, x=0;
        while (Math.abs(max-min)>errorStep){
            mid = (max+min)/2;
            if (func(mid)*func(min)<0) max = mid;
            else if (func(mid)*func(max)<0) min = mid;
            else{
                System.out.println("Нет корней на заданном участке");
                break;
            }
        }
        System.out.println("Найден корень: " + mid + "    " + func(mid));
    }

}
