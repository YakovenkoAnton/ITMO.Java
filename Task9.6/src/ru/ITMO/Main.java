package ru.ITMO;
//
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.stream.Stream;

// 6. Написать метод, который в каталоге ищет текстовые файлы, в которых содержится
//определенная строка, и который возвращает список имен таких файлов.
public class Main {

    public static void main(String[] args) {
        File folder = new File("C:\\DATA\\Text\\");
        String searchRow = "класс";
        ArrayList<String> find = new ArrayList<>();

        for (File file : folder.listFiles()) {
            try {
                Files.lines(file.toPath(), StandardCharsets.UTF_8).
                        filter(str->str.contains(searchRow)).
                        forEach(str-> System.out.println(file.getName()));

        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }
}

