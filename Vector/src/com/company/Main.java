package com.company;

public class Main {

    public static void main(String[] args) {
        Vector[] newArr = Vector.vectorArr(5);
        for (int i=0; i<5;i++) {

            System.out.println(newArr[i].x + "  " +
                    newArr[i].y + "  " +
                    newArr[i].z);
        }

        System.out.println("Сумма: " +
                Vector.sumVector(newArr[0], newArr[1]).x + " " +
                Vector.sumVector(newArr[0], newArr[1]).y + " " +
                Vector.sumVector(newArr[0], newArr[1]).z)
        ;

        System.out.println("Разность: " +
                Vector.difVector(newArr[0], newArr[1]).x + " " +
                Vector.difVector(newArr[0], newArr[1]).y + " " +
                Vector.difVector(newArr[0], newArr[1]).z)
        ;
    }
}
