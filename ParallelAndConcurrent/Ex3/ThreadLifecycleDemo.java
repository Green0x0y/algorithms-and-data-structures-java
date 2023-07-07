package org.ParallelAndConcurrent.Ex3;

class ChefAlex extends Thread{
    public void run(){
        System.out.println("Alex started & waiting for onion to thaw... ");
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(" Alex is done cutting ");
    }
}

public class ThreadLifecycleDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Barron started & requesting ");
        Thread alex = new ChefAlex();
        alex.start();

        System.out.println("Both started");

        Thread.sleep(500);

        System.out.println("Barron waits for Alex to join...");
        alex.join();

        System.out.println("Done ");
    }
}
