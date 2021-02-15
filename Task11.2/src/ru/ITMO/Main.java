package ru.ITMO;

import java.util.HashMap;
import java.util.Map;

//2. Метод получает на вход массив элементов типа К.
//Вернуть надо объект Map<K, Integer>, где K — Значение из массива, а Integer
//количество вхождений в массив.
//<K> Map<K, Integer> arrayToMap(K[] ks);

public class Main {

    public static void main(String[] args) {
	    int [] array = {100,100,12,12,12,12,45,56,5,5,3,35,5,5,5,5,5,5,5,65,6,56,65,64,97,1,2,3};
        int index = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (index<array.length){
            if (!map.containsKey(array[index])) {
                int count = 1;
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] == array[index]) count++;
                }
                map.put(array[index], count);
            }
            index++;
        }
        System.out.println(map);
    }
}
