package org.Tasks.Functional.Lambdas;

import java.util.Random;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new HelloGreeting();
        greeting.sayHello();

        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello World");
            }
        };

        greeting1.sayHello();


        Greeting greeting2 = () -> System.out.println("Hello World");
        greeting2.sayHello();

        IntBinaryOperator calculator = (int x, int y) -> {
            Random random = new Random();
            int rand = random.nextInt(50);
            return x * y + rand;
        };
        System.out.println(calculator.applyAsInt(1,2));
    }
}
