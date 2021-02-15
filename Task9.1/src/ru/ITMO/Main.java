package ru.ITMO;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

//1. Написать метод, который читает текстовый файл и возвращает его в виде списка строк.
public class Main {

    public static void main(String[] args) {
//        вариант 1
//        try {
//            Files.lines(Paths.get("C:\\DATA\\test.txt"), StandardCharsets.UTF_8).forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        вариант 2

        ArrayList<String> str = new ArrayList();
        String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader(new File("c:\\data\\test.txt")))) {
            while (line != null) {
                line = br.readLine();
                str.add(line);
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
