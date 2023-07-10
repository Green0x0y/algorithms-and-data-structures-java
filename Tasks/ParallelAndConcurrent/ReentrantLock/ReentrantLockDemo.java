package org.Tasks.ParallelAndConcurrent.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

class Shopper extends Thread{
    static int garlicCount, potatoCount = 0;
    static ReentrantLock pencil = new ReentrantLock();

    private void addGarlic(){
        pencil.lock();
        System.out.println(pencil.getHoldCount());
        garlicCount++;
        pencil.unlock();

    }

    private void addPotato(){
        pencil.lock();
        potatoCount++;
        addGarlic();
        pencil.unlock();

    }

    public void run(){
        for(int i = 0 ; i < 100000; i++ ){
            addGarlic();
            addPotato();
        }
    }
}

public class ReentrantLockDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread barron = new Shopper();
        Thread olivia = new Shopper();
        barron.start();
        olivia.start();
        barron.join();
        olivia.join();
        System.out.println(Shopper.garlicCount);
        System.out.println(Shopper.potatoCount);
    }
}


