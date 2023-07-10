package org.Tasks.ParallelAndConcurrent.Deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Philosopher extends Thread{
    private Lock firstChopstick, secondChopsticks;
    private static int sushiCount = 500;

    public Philosopher(String name, Lock firstChopstick, Lock secondChopsticks){
        this.setName(name);
        this.firstChopstick = firstChopstick;
        this.secondChopsticks = secondChopsticks;
    }

    public void run(){
        while (sushiCount > 0){
            firstChopstick.lock();
            secondChopsticks.lock();
            try{

                if (sushiCount > 0){
                    sushiCount--;
                    System.out.println(this.getName() +" "+ sushiCount);
                }

            }finally{
                firstChopstick.unlock();
                secondChopsticks.unlock();
            }


        }
    }
}
public class DeadlockDemo {
    public static void main(String[] args) {
        Lock chopstickA = new ReentrantLock();
        Lock chopstickB = new ReentrantLock();
        Lock chopstickC = new ReentrantLock();
        new Philosopher("Adam", chopstickA, chopstickB).start();
        new Philosopher("Anna", chopstickB, chopstickC).start();
        new Philosopher("Alexander", chopstickA, chopstickC).start();
    }
}
