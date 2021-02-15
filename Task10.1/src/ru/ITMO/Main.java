package ru.ITMO;

public class Main {

    public static void main(String[] args) {
        // Task1();
        // Task2();
        // Task3();
        // Task4();
        Task41();
    }


    static void Task1() {
        for (int i = 1; i <= 10; i++) {
            //System.out.println("Поток: " + i);
            new MyThread(i).start();
        }
    }

    static void printStatusThread(Thread thread) {
        System.out.println("Поток 11 имеет статус - " + thread.getState());
    }

    static void Task2() {
        Thread testThread = new MyThread(11);
        printStatusThread(testThread);
        testThread.start();
        printStatusThread(testThread);
        try {
            testThread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printStatusThread(testThread);
        testThread.stop();
        printStatusThread(testThread);
    }

    static void Task3() {
        for (int i = 0; i < 100; i++) {
            new NewThread().start();
        }
        try {
            NewThread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("get count  " + Counter.getCount());
    }

    static void Task4() {
        ThreadName thread1 = new ThreadName("FirstThread");
        ThreadName thread2 = new ThreadName("SecondThread");
        thread1.start();
        thread2.start();
    }

   // static class Thread41 extends Thread{
    //private Object object;

    //public Thread41(Object object){
        //this.object=object;
   // }





    static void Task41() {
//        Thread41 thr1 = new Thread41("FirstThread");
//        Thread41 thr2 = new Thread41("SecondThread");
        Object object = new Object();
        new Thread41(object).start();
        new Thread41(object).start();
//        thr1.start();
//        thr2.start();

    }
}








