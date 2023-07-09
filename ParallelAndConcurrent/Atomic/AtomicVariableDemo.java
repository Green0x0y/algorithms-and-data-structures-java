package org.ParallelAndConcurrent.Atomic;

import java.util.concurrent.atomic.AtomicInteger;

class Shopper extends Thread{
    static AtomicInteger garlicCount = new AtomicInteger(0);
    public void run(){
        for(int i = 0 ; i < 1000000; i++ ){
            garlicCount.incrementAndGet();
        }
    }
}

public class AtomicVariableDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread barron = new Shopper();
        Thread olivia = new Shopper();
        barron.start();
        olivia.start();
        barron.join();
        olivia.join();
        System.out.println(Shopper.garlicCount);
    }
}
