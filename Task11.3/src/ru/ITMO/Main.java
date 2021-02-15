package ru.ITMO;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int [] array = {1,20,123,21,21,21,54,65,10,12,13,16,22,23,25,26,87,54,54,652,320,620,20,20,26,65,654,1,0,2};
        int search = 10;

	    System.out.println("Исходный массив :");
        for (int i=0; i<array.length;i++) System.out.print(array[i] + " ");

        Arrays.sort(array);
        System.out.println("\n\nОтсортированный массив :");
        for (int i=0; i<array.length;i++) System.out.print(array[i] + " ");

        Thread thread = new Thread(()->{
           boolean result=false;
           int min = 0;
           int mid = 0;
           int max=array.length-1;
           while (min<max){
               mid=(min+max)/2;
               if (array[mid]==search) {
                   result = true;
                   break;
               }
               if (array[mid]>search) max=mid;
               else min=mid;
           }
           if (result) System.out.println("\nЭлемент " + search + "встречается в массиве");
           else  System.out.println("\nЭлемент " + search + "не встречается в массиве");
        });
        thread.start();

    }
}
