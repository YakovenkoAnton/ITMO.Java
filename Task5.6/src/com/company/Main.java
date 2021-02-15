package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        try(String content = new String(Files.readAllBytes(Paths.get("test.txt")), "UTF-8"))
        {

        }
        catch (IOException ex) {
            System.out.println(ex);}



    }
}
