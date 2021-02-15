package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int lenArr = 10, rangeArr = 100;
        int min=rangeArr, max=0, sum = 0;
        int[] array = new int[lenArr];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.random() * rangeArr);
            if (min > array[i])
                min = array[i];
            else if (max < array[i])
                max = array[i];
            sum = sum+array[i];
            System.out.println(array[i]);
        }
        System.out.println("min = " +  min + "  max = " + max + " avr = " + sum/lenArr);
    }
}