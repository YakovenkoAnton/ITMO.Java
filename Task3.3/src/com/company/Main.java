package com.company;

import java.util.Random;
import java.util.Scanner;

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
        System.out.println("\n\nМассив четных элементов: ");
        evenArray(rndArray);
    }



        public static int [] evenArray(int []Array) {
            int []evenArray=new int[Array.length];
            int count=0;
            for (int i = 0; i < Array.length; i++) {
                if (Array[i] % 2 == 0) {
                    evenArray[count] = Array[i];
                    System.out.print(evenArray[count] + " | ");
                    count++;
                }
            }
            return evenArray;
        }
}
