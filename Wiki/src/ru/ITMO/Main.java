package ru.ITMO;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String resultUrl = makeUlr();

        StringBuilder stringBuilder = pars(resultUrl);

        Object obj = new JsonParser().parse(String.valueOf(stringBuilder));
        JsonObject resp = (JsonObject) obj;

        JsonObject ser = (JsonObject) (resp.get("query"));
        JsonArray k = ser.getAsJsonArray("search");

        for (var i:k){

            JsonObject a = (JsonObject) i;
            System.out.println(a.get("title"));
            String aa= a.get("snippet").toString().replace("<span class=\\\"searchmatch\\\">",
                    "").replace("</span>", "");

            System.out.println(new StringBuilder(aa).insert(75,"\n"));
            System.out.println();
        }
    }


    static String makeUlr(){
        String baseURL = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш запрос: ");
        String query = scanner.next();
        System.out.println();
        String encodeStr = null;
        try {
            encodeStr = URLEncoder.encode(query, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return baseURL+encodeStr;
    }


    static StringBuilder pars(String resultUrl){
        URL url = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            url = new URL(resultUrl);
        URLConnection urlConnection = url.openConnection();
        String line;
        InputStream inputStream = urlConnection.getInputStream();
        InputStreamReader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);

        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder;
    }
}
