package org.Tasks.ParallelAndConcurrent.Ex2;

class VegetableChopper extends Thread{
    public int vegetable_count = 0;
    public static boolean chopping = true;

    public VegetableChopper(String name) {
        this.setName(name);
    }
    public void run(){
        while(chopping){
            System.out.println(this.getName() + "chopped a vegetable! ");
            vegetable_count++;
        }
    }
}
public class ExecutionSchedulingDemo{
    public static void main(String[] args) throws InterruptedException{
        VegetableChopper person1 = new VegetableChopper("Alex");
        VegetableChopper person2 = new VegetableChopper("Anna");

        person1.start();
        person2.start();

        Thread.sleep(1000);
        VegetableChopper.chopping = false;

        person1.join();
        person2.join();

        System.out.println(" Alex: " + person1.vegetable_count + "  vegetables \n");
        System.out.println(" Anna: " + person2.vegetable_count + "  vegetables \n");

    }
}


