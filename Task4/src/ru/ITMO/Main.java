package ru.ITMO;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        fillBox();
        BaseConverter.convert(100);

        addLines();

        isPalyndrom("топот");
        isPalyndrom("лес");
    }





    static void fillBox(){
        Box box = new Box(2000);
        Random rnd = new Random();
        while (box.add(new Ball(rnd.nextInt(13)+1)));
        box.add(new Pyramid(5,20));
        box.add(new Cylinder(4,6));
    }

    static void addLines(){
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Введите строки. Для завершения введите EXIT. \n");
        String tmp="";
        while (!tmp.toUpperCase().equals("EXIT")) {
            tmp = scanner.nextLine();
            sb.append(tmp);
            sb.append(", ");
        }
        sb.delete(sb.length()-8, sb.length());
        System.out.println("Итоговая строка: \n" + sb);
    }

    static void isPalyndrom(String str){
        System.out.print(str);
        if (new StringBuilder(str).reverse().toString().equals(str))
            System.out.println(" - полиндром ");
        else System.out.println(" - не полиндром ");


    }
}
