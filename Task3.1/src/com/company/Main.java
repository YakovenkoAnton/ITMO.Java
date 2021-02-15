package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int arrayRange = 20;
    public static void main(String[] args) {
        int[] rndArray = new int[arrayRange];
        Random rnd = new Random();
        for (int i = 0; i < rndArray.length; i++) {
            rndArray[i] = rnd.nextInt(100);
            System.out.print(rndArray[i] + " | ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите элемент для поиска ");
        int userNumber = scanner.nextInt();
        System.out.println(indexOf(rndArray, userNumber));
    }



    static int indexOf(int []arr, int target) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index=i;
                break;
            }
        }
        return index;
    }

}

