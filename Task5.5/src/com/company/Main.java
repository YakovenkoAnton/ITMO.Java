package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String text = "This is a test string";
        String [] words = text.split(" ");
        char temp;
        for (String word: words){
            char [] arrChar=word.toCharArray();
            for (int j=0; j < arrChar.length/2; j++){
                temp=arrChar[j];
                arrChar[j]=arrChar[arrChar.length-1-j];
                arrChar[arrChar.length-1-j]=temp;
            }
            word="";
            for(char c:arrChar) word+=c;
            System.out.print(word + " ");


        }
    }
}
