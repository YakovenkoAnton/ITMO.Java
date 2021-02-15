package ru.ITMO;
// 5. Написать метод, который в каталоге ищет файлы, в имени которых содержится
//определенная строка, и который возвращает список имен таких файлов.

import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        File folder = new File("C:\\DATA\\");
        String searchRow = ".txt";
        ArrayList<String> find = new ArrayList<>();

        for (File file : folder.listFiles()) {
            if (file.getName().contains(searchRow)) find.add(file.getName());
        }
        if (find.size()==0) System.out.println("Ничего не найдено");
        else {
            System.out.println("Следующие имена файлов содержат строку " + searchRow);
            for (String s:find)
            System.out.println(s);
        }
    }
}
