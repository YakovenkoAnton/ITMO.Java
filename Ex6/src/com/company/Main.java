package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        int lenArr=15, rangeArr = 10, N=0, count=0;
        out.println("Введите число: ");
        Scanner scan = new Scanner(in);
        try {
            N = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            out.println("Неверный формат ввода");
        }

        int[] array = new int[lenArr];
        for (int i = 0; i < lenArr; i++) {
            array[i] = (int) (Math.random() * rangeArr);
            System.out.print(array[i] + " | ");
        }
        System.out.println();

        for (int i = 0; i < (lenArr-count); i++)
        {
            if (array[i]==N)
            {
                count++;
                for (int j = i; j<(lenArr-count); j++)
                {
                    array[j] = array[j + 1];
                }
            }

        }

        for (int i = 0; i < (lenArr-count); i++)
            System.out.print(array[i] + " | ");

    }
}

