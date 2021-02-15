package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("----- Задание 1 -----");
        String[] arr1 = new String[]{"gdfgfgsdf", "gsdfgsdfgfdgs","gsdfgd","fsdggdfgsdfgdsfgdsfgdsg"};
        longestStr(arr1);

        System.out.println("----- Задание 2 -----");
        String[] arr2 = new String[]{"1", "1231", "gdfgfgsdf", "топот", "www", "http", "tttttttttt", "Неуч учуен", "121", "1221"};
        palindrom(arr2);

        System.out.println("----- Задание 3 -----");
        String text = "аыв бЯка вав ваыва БЯКА ваоо бяка лоалв л бяКа авдва в в алдвлв лдавл бякА";
        String cens = "бяка", censText = "[вырезано цензурой]";
        censor(text, cens, censText);

        System.out.println("----- Задание 4 -----");
        System.out.println(("Подстрока " + cens + " встречается " + countStr(text, cens) + " раз."));



    }

    public static void longestStr(String [] arr){

    String longestStr="";
	for (String i:arr){
        if (i.length()>longestStr.length()) longestStr=i;
    }
        System.out.println("Самая длинная строка из " + Arrays.toString(arr) + "  -->  " + longestStr);
    }


    public static void palindrom(String[] arr){
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

   public static void censor(String text, String cens, String censText){
       System.out.println("Исходный текст: \n" + text);
       String [] arr = text.split(" ");
       for (int  i=0; i<arr.length; i++){
           if (arr[i].equalsIgnoreCase(cens)) arr[i]=censText;
           System.out.print(arr[i] + " ");
       }
   }

   public static int countStr(String text, String cens){
       int count=0;
       System.out.println("Исходный текст: \n" + text);
       String [] arr = text.split(" ");
       for (int  i=0; i<arr.length; i++){
           if (arr[i].equalsIgnoreCase(cens)) count++;
       }
       return count;

   }

}






