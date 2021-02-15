package ru.ITMO;

import java.io.*;
// 3. Используя решение 1 и 2, напишите метод, который склеивает два текстовый
//файла один.

public class Main {

    public static void main(String[] args) {
        String file1 = "c:\\data\\test.txt";
        String file2 = "c:\\data\\Kotlin.txt";
        String result = "c:\\data\\result.txt";
        rwfile(file1, result);
        rwfile(file2, result);
    }


    static void rwfile(String file, String result) {
        String line;
        BufferedWriter bw;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            FileWriter fw = new FileWriter(result, true);
            bw = new BufferedWriter(fw);
            while (true) {
                line = br.readLine();
                if (line == null) break;
                bw.write(line + "\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

