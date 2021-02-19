package com.example.helloworld;


public class HelloWorld {
    public static void main(String[] args) {
        boolean test = true;
        String message = "Hello world!";
        message = message.concat(" You're awesome.");
        System.out.println(message);
        Pump p1 = new Pump();
        test = p1.run();
        System.out.print(test);
    }
}
