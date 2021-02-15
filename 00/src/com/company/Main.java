package com.company;

public class Main {


        public static void main(String[] args) {

            int a = 1;

            a=a+(a=a+1)+(a++);

            System.out.println(a);

        }
    }

