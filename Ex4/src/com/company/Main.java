package com.company;

public class Main
{

    public static void main(String[] args)
    {
        boolean prime;
        for (int i = 2; i < 200; i++)
        {
            prime = false;
            for (int j = 2; j<=Math.sqrt(i+1); j++)
            {
                if (i%j!=0) prime=true;
                else
                    {
                        prime=false;
                        break;
                    }
            }
            if (prime) System.out.println(i);
        }
    }
}