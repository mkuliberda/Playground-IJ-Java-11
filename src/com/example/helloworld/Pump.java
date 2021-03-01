package com.example.helloworld;

public class Pump {
    boolean running=false;
    String state = "unknown";

    boolean run() {state = "running"; return false;}
    void forward(){state = "running forward"; running = true;}
    Pump stop(){state = "stopped"; running = false; return this;}
    void printState() {System.out.println(state);}
}

class ExtendedPump extends Pump{

    void backward() {state = "running backward"; running = true; printState();}
    static int encodeStatus(){return 0x89;}
}
