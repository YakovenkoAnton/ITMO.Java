package ru.ITMO;

import java.util.Iterator;


public class IteratorTwo<T> implements Iterator<T>{

    public T[][] array;
    public int i, j;

    public IteratorTwo(T [][] array){
        this.array=array;
    }

        @Override
        public boolean hasNext(){
        return i < array.length && j<array[i].length;
    }

        @Override
        public T next(){
        T ar = array[i][j++];
        if (j>=array[i].length){
            i++;
            j=0;
        }
        return ar;
    }
    }


