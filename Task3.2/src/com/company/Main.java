package com.company;

public class Main {


    public static void main(String[] args) {
        int[] Array1 = {0,2,3,5,78,150,200,250,300,456,546,1235,1500,150511,1515151,1515151151};
        int[] Array2= {5,0,12,1,0,500,1203,2,3,4,5,6,7,8,0};
        increaseArr(Array1);
        increaseArr(Array2);

    }


    public static void increaseArr(int[] Array) {

        boolean increase=false;
        String answer;
        for (int i = 0; i < Array.length; i++)
            System.out.print(Array[i] + "  ");
        for (int i = 0; i < Array.length-1; i++) {
            if (Array[i + 1] >= Array[i]) increase = true;
            else {
                increase = false;
                break;
            }
        }
        if (increase) answer="\nМассив является возрастающей последовательностью\n";
        else answer = "\nМассив НЕ является возрастающей последовательностью\n";
        System.out.println(answer);
    }
}




