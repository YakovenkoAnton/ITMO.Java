package ru.ITMO;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

// 4. Написать метод для копирования файла
public class Main {

    public static void main(String[] args) {
        String source = "c:\\data\\test.txt";
        String target = "c:\\data\\target.txt";
        try {
            Files.copy(Path.of(source), Path.of(target));
        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exist!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
