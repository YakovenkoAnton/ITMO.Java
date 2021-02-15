package com.company;

public class Main {

    public static void main(String[] args) {
        String text = " аыв бЯка вав ваыва БЯКА ваоо бяка лоалв л бяКа авдва в в алдвлв лдавл бякА";
        String cens = "бяка";
        int count=0;

        System.out.println("Исходный текст: \n" + text);


        String [] arr = text.split(" ");
        for (int  i=0; i<arr.length; i++){
            if (arr[i].equalsIgnoreCase(cens)) count++;
        }
        System.out.println(("Подстрока " + cens + " встречается " + count + " раз."));
    }
}
