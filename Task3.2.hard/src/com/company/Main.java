package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int arrayRange = 40;
        int[] rndArray = new int[arrayRange];
        Random rnd = new Random();
        //System.out.println("\nИсходный массив случайных чисел: ");
        for (int i = 0; i < rndArray.length; i++) {
            rndArray[i] = rnd.nextInt(100);
            System.out.print(rndArray[i] + " ");
        }
        System.out.println();
        sortSelect(rndArray);
    }

    public static void sortSelect(int[] arr){
        for (int i=0; i< arr.length;i++){
            int minIndex = i;
            for(int j=minIndex+1; j<arr.length;j++){
                if (arr[j]<arr[minIndex]) minIndex=j;
            }
            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
            System.out.print(arr[i] + " ");
        }

    }






}
