package com.msa4java.edu.oop.inheritance;

public class inheritanceMain {
    public static void main(String[] args) {
        Whale whale = new Whale("고래니", "태평양");
        whale.breath();

        FlyingSquirrel flyingSquirrel = new FlyingSquirrel("모몽가", "태백산맥");
        flyingSquirrel.breath();
    }
}
