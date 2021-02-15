package ru.ITMO;

public class MyThread extends Thread{
    int nThread;
    @Override
    public void run() {
        for (int i=0; i<=100; i++) {
            System.out.println("поток " + nThread + " " + i + " ");
        }
    }

    public MyThread(int nThread){
        this.nThread=nThread;
    }
}

