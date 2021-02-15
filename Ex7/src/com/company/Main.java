package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        int lenArr=15, rangeArr = 10, count=0;
        boolean noUnique;
        int[] array = new int[lenArr];
        while (noUnique) {
            for (int i = 0; i < lenArr; i++) {
                for (int j = i + 1; j < lenArr-1; j++)
                    if (array[i] = array[j])
                    {
                        noUnique=False
                    }

                        System.out.print(array[i] + " | ");
            }
        }
        System.out.println();

    }
}
