package org.Tasks.ParallelAndConcurrent.Synchronized;


class Shopper2 extends Thread{
    static int garlicCount = 0;

    private static synchronized void addGarlic(){
         garlicCount++;
    }

    public void run(){
        for(int i = 0 ; i < 1000000; i++ ){
            addGarlic();
        }
    }
}

public class SynchronizedMthodDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread barron = new Shopper2();
        Thread olivia = new Shopper2();
        barron.start();
        olivia.start();
        barron.join();
        olivia.join();
        System.out.println(Shopper2.garlicCount);
    }
}


