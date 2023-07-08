package org.ParallelAndConcurrent.DataRace;

class Shopper extends Thread{
    static int garlicCount = 0;
    public void run(){
        for(int i = 0 ; i < 1000000; i++ ){
            garlicCount++;
        }
    }
}

public class DataRaceDemo {
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
