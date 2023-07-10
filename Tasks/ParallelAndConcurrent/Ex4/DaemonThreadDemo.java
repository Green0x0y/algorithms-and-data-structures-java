package org.Tasks.ParallelAndConcurrent.Ex4;

class KitchenCleaner extends Thread{
    public void run() {
        while(true){
            System.out.println("Cleaning");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class DaemonThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread olivia = new KitchenCleaner();
        //finishes when terminate
        olivia.setDaemon(true);
        olivia.start();

        System.out.println("Barron is cooking...");
        Thread.sleep(600);
        System.out.println("Barron is cooking...");
        Thread.sleep(600);
        System.out.println("Barron is cooking...");
        Thread.sleep(600);
        System.out.println("Barron is done");

    }
}
