package ru.ITMO;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        List<String> urlStr=new ArrayList<>();
        List<String> fileToSave=new ArrayList<>();
        String urlFile=""; //="links.txt";
        int numthread=3;
        String outputFolder="";// = "c:\\DATA\\Download\\";
        try {
            numthread = parseInt(args[0]);
            outputFolder = args[1];
            urlFile = args[2];
        }
        catch (Exception e) {
            System.out.println("Неверные входные параметры");
        }
        System.out.println("Введены следующие параметры скачивания: \n" +
                "\nколичество одновременых потоков: " + numthread +
                "\nпапка со скачанными файлами: " + outputFolder +
                "\nпуть к файлу со списком ссылок: " + urlFile + "\nСодержимое файла: \n");

        List<String> lines = null;

        try {
            lines = Files.readAllLines(Paths.get(urlFile), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(String line:lines) {
            urlStr.add(line.split(" ")[0]);
            fileToSave.add(line.split(" ")[1]);
            System.out.println(line);
        }
        System.out.println();


        long tm = System.currentTimeMillis();
        int totalSize=0;
        List<Thread> threads = new ArrayList<>();
        for (int i=0; i<urlStr.size(); i++) {
            threads.add(new DownloadThread(urlStr.get(i), outputFolder, fileToSave.get(i)));
        }
        for(Thread thread:threads) thread.start();
        for(Thread thread:threads) thread.join();
        for (int i=0; i<urlStr.size();i++)
            totalSize+=new File(outputFolder+fileToSave.get(i)).length()/1024;

        tm=System.currentTimeMillis() - tm;

        System.out.println("\nОбщее время загрузки " + tm + " мс \n" +
                "Общий размер файлов " + totalSize + " kb \n" +
                        "Средняя скорость загрузки " + totalSize*1000/(int)tm + " kb/s");


    }
}
