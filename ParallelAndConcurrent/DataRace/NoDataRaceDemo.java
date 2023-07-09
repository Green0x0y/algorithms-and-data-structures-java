package org.ParallelAndConcurrent.DataRace;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Shopper2 extends Thread{
    static int garlicCount = 0;
    static Lock pencil = new ReentrantLock();
    public void run(){
        pencil.lock();
        for(int i = 0 ; i < 1000000; i++ ){
            garlicCount++;
        }
        System.out.println(Thread.currentThread().getName() + "  Thinking");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pencil.unlock();
    }
}

public class NoDataRaceDemo {
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
