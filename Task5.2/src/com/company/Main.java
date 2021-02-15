package com.company;

public class Main {

    public static void main(String[] args) {
        String[] arr = new String[]{"1", "1231", "gdfgfgsdf", "топот", "www", "http", "tttttttttt", "Неуч учуен", "121", "1221"};
        boolean pal = true;
        String answer = "";
        for (String str : arr) {
            String i = str.replaceAll(" ", "");
            char arrChar[] = i.toCharArray();
            for (int j = 0; j < arrChar.length / 2; j++) {
                if (Character.toUpperCase(arrChar[j]) == Character.toUpperCase(arrChar[arrChar.length - 1 - j]))
                    pal = true;
                else {
                    pal = false;
                    break;
                }
            }
            if (pal) answer = "Палиндром: ";
            else answer = "Не палиндром: ";
            System.out.println(answer + str);
        }
   }
}

