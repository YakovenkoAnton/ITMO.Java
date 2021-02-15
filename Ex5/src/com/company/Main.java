package com.company;

public class Main {

    public static void main(String[] args)
    {
        int N=10, prev=0, next=1;
        for(int i = 0; i < N-1; i++)
        {
            next = prev + next;
            prev = next - prev;
            System.out.println(prev);
        }
        System.out.println(N + " элемент ряда Фибоначчи " + next);
    }
}
