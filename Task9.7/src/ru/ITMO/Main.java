package ru.ITMO;

import java.io.File;
import java.util.ArrayList;
import java.util.function.BiFunction;


public class Main {

    public static void main(String[] args) {
        File folder = new File("C:\\DATA\\");
        String searchRow = ".mdf";
        ArrayList<String> find = new ArrayList<>();

        BiFunction<File, String, Boolean> finder = (file, sRow) ->file.getName().contains(sRow);

        for (File file : folder.listFiles())
            if (finder.apply(file, searchRow)) find.add(file.getName());

            if (find.size()==0) System.out.println("Ничего не найдено");
            else {
            System.out.println("Следующие имена файлов содержат строку " + searchRow);
            for (String s:find)
                System.out.println(s);
        }
    }
}
