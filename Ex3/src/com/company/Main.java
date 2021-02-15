package com.company;

public class Main
{

    public static void main(String[] args)
    {
        //fill
        int lenArr = 10, rangeArr = 100;
        int[] array = new int[lenArr];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.random() * rangeArr);
            System.out.print(array[i] + " | ");
        }
        //sort selection
        for (int i = 0; i < array.length; i++)
        {
            int min = array[i];
            int minIndex = i;
            for (int j = i+1; j < array.length; j++)
            {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            // ch
            int temp = array[i];
            array[i] = min;
            array[minIndex] = temp;
        }
        // print sort
        System.out.println();
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " | ");
        }


    }
}