package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int N;
        double k;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите N: ");
        try
        {
            N = Integer.parseInt(scan.nextLine());6

            System.out.println("Введите k: ");
            k = Double.parseDouble(scan.nextLine());
            double sum = 0;
            for (int i = 1; i <= N; i++)
                sum = sum + Math.pow((int) i, k);
            System.out.println("sum= " + sum);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Неверный формат ввода");
        }
    }
}