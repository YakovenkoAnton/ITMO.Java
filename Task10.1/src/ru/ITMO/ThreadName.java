package ru.ITMO;

import java.awt.event.KeyAdapter;

public class ThreadName extends Thread{

    String name;

    public ThreadName(String name){
        this.name = name;
    }



    @Override
    public void run(){
        while (true){
            try {
                ThreadName.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Поток " + name + " передает управление следующему потоку");
            Thread.yield();
        }
    }
}
