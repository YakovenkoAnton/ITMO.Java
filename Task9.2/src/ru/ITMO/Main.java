package ru.ITMO;
//2. Написать метод, который записывает в файл строку, переданную параметром.
import java.io.*;

public class Main {

    public static void main(String[] args) {
        BufferedWriter bw;
        try {
            FileWriter fw = new FileWriter("C:\\data\\forwrite.txt",false);
            bw = new BufferedWriter(fw);
            for (String line : args) {
                bw.write(line + " ");
            }
            bw.close();
        }
         catch (IOException e) {
            e.printStackTrace();
        }

    }
}
