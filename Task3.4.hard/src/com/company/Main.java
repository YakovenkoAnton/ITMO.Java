package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int arrayRange = 100;
        int[] rndArray = new int[arrayRange];
        Random rnd = new Random();
        for (int i = 0; i < rndArray.length; i++) {
            rndArray[i] = rnd.nextInt(100);
        }
        //System.out.println("\nИсходный массив случайных чисел:\n" + Arrays.toString(rndArray));

        long time = System.nanoTime();
        qSort(rndArray, 0, rndArray.length-1);
        time = System.nanoTime() - time;

        //System.out.println("\nОтсортированный массив случайных чисел:\n" + Arrays.toString(rndArray));
        System.out.println("\nВремя выполнения сортировки " + time);

        time = System.nanoTime();
        Arrays.sort(rndArray);
        time = System.nanoTime() - time;

        //System.out.println("\nОтсортированный массив случайных чисел:\n" + Arrays.toString(rndArray));
        System.out.println("\nВремя выполнения сортировки " + time);





    }

    public static void qSort(int [] arr, int start, int end){
        if (start>=end) return;
        int pivot = arr[start+(end-start)/2];
        //int pivot = arr[start];
        //int pivot  =arr[end];

        //int [] tmpArr = {arr[start], arr[start+(end-start)/2], arr[end]};
        //Arrays.sort(tmpArr);
        //int pivot = tmpArr[1];



        int i=start, j=end;
        while (i<=j){
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;
            if (i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        if (start<j) qSort(arr, start,j);
        if (end>i) qSort(arr, i, end);
    }
}
