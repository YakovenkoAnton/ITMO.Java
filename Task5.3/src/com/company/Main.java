package com.company;

public class Main {

    public static void main(String[] args) {
        String text = " аыв бЯка вав ваыва БЯКА ваоо бяка лоалв лавдва в в алдвлв лдавл бякА";
        String cens = "бяка", censText = "[вырезано цензурой]";

        System.out.println("Исходный текст: \n" + text);


        String [] arr = text.split(" ");
            for (int  i=0; i<arr.length; i++){
                if (arr[i].equalsIgnoreCase(cens)) arr[i]=censText;
                System.out.print(arr[i] + " ");
            }
    }
}
