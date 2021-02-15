package com.company;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        int arrayRange = 20;
        int[] rndArray = new int[arrayRange];
        Random rnd = new Random();
        System.out.println("\nИсходный массив случайных чисел: ");
        for (int i = 0; i < rndArray.length; i++) {
            rndArray[i] = rnd.nextInt(100);
            System.out.print(rndArray[i] + " | ");
        }
        System.out.println("\n\nМассив c элементами в обратном порядке: ");
        reversArray(rndArray);
        for (int j : rndArray) {
            System.out.print(j + " | ");
        }
    }


    public static void reversArray(int[] Array) {
        int temp;
        for (int i = 0; i < (Array.length / 2); i++) {
            temp = Array[i];
            Array[i] = Array[Array.length - i-1];
            Array[Array.length-i-1] = temp;
        }

    }
}
