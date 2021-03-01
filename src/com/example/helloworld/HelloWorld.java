package com.example.helloworld;
import java.time.*;

public class HelloWorld {

    public boolean isTestBool() {
        return testBool;
    }

    public void setTestBool(boolean testBool) {
        this.testBool = testBool;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private boolean testBool = true;
    private String message = "Hello world!";


    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();

        hello.setMessage("Hello world!".concat(" You're awesome."));
        System.out.println(hello.getMessage());
        Pump p1 = new Pump();
        hello.setTestBool(p1.run());
        System.out.println(hello.isTestBool());
        System.out.println(p1.stop().run());

        Boolean running = false;
        System.out.println(running.toString());
        Character myName = 0x65;
        System.out.println(myName.charValue());

        ExtendedPump p2 = new ExtendedPump();
        p2.backward();

        Object o = new Object();
        System.out.println(ExtendedPump.encodeStatus());

    }
}
