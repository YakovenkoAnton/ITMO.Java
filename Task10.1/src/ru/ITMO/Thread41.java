package ru.ITMO;


public class Thread41 extends Thread {
    String name;
    private Object object;


    public Thread41(Object object) {
        this.object = object;
    }

    @Override
    public  void run() {

        while (true) {
            synchronized (object){

                try{
                    System.out.println(getName());

                    object.notify();
                    object.wait();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}