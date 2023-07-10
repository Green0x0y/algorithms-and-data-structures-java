package org.Tasks.ParallelAndConcurrent.Ex1;

class CPUWaster extends Thread{
    public void run(){
        while(true){}
    }
}

public class ThreadProcessDemo {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        long  usedKB = (rt.totalMemory() - rt.freeMemory()) / 1024;
        System.out.printf("  Process ID:  %d\n", ProcessHandle.current().pid());
        System.out.printf("Thread Count:  %d\n", Thread.activeCount());
        System.out.printf("Memory Usage:  %d\n", usedKB);

        System.out.println("\n Starting 6 CPUWaster threads...\n");
        for (int i = 0; i < 6; i++ ){
            new CPUWaster().start();
        }

        usedKB = (rt.totalMemory() - rt.freeMemory()) / 1024;
        System.out.printf("  Process ID:  %d\n", ProcessHandle.current().pid());
        System.out.printf("Thread Count:  %d\n", Thread.activeCount());
        System.out.printf("Memory Usage:  %d\n", usedKB);
    }
}
