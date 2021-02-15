package ru.ITMO;

public class NewThread extends Thread {
    @Override
    public void run() {
        for (int i=0; i<1000; i++) {
            Counter.increment();
        }
    }
}
