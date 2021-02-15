package com.company;

import java.util.Arrays;
import java.util.Random;
//        Написать метод, который проверяет, входит ли в сортированный массив
//        заданный элемент или нет.
//        Используйте перебор и двоичный поиск для решения этой задачи.
//        Сравните время выполнения обоих решений для больших массивов (например, 100000 элементов).

public class Main {

    public static void main(String[] args) {
        int arrayRange = 100000;
        int[] rndArray = new int[arrayRange];
        Random rnd = new Random();
        //System.out.println("\nИсходный массив случайных чисел: ");
        for (int i = 0; i < rndArray.length; i++) {
            rndArray[i] = rnd.nextInt(100);
                System.out.print(rndArray[i] + " ");
        }
        Arrays.sort(rndArray);
        searchEnum(rndArray, 10);
        searchBin(rndArray, 10);
    }

    public static void searchEnum(int[] Array, int targetNum) {
        long time = System.nanoTime();
        int count = 0;
        for (int i : Array) {
            if (i == targetNum)
                //count++;
            {
                System.out.println("\n Встречается");

                break;


            }
        }
        //String answer = "Элемент " + targetNum + " не входит в массив";
        //if (count > 0) answer = "Элемент " + targetNum + " встречается в массиве " +
                //count
                //+
                //        " раз";
        time = System.nanoTime() - time;
        System.out.println("\n" +  "\nВремя выполнения: " + String.format("%,d", time / 1000) + " мкс");
    }

    public static void searchBin(int[] Array, int targetNum){
        long time = System.nanoTime();
        String answer = "Элемент " + targetNum + " не входит в массив";
        int first=0, mid=0, last=Array.length;
        boolean detected=false;
        while (first+1 < last && !detected){
            mid = (first + last)/2;
            if (targetNum < Array[mid]) last=mid;
            else if (targetNum > Array[mid]) first=mid;
            else detected=true;
        }
        time = System.nanoTime() - time;
        if (detected) answer= "Элемент " + targetNum + " входит в массив";
        System.out.println("\n" + answer + "\nВремя выполнения: " + String.format("%,d", time / 1000) + " мкс");
    }
}
