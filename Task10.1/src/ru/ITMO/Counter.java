package ru.ITMO;

class Counter {

    static int count = 0 ;
    public static synchronized void increment() {
        count = count + 1 ;
    }
    public static int getCount() {
        return count ;
    }

}
