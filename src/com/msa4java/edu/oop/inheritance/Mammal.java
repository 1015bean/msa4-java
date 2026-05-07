package com.msa4java.edu.oop.inheritance;

public class Mammal {
    protected String name;
    protected String residence;

    public Mammal(String name, String residence) {
        this.name = name;
        this.residence = residence;
    }

    public void breath() {
        System.out.println(this.name + "이/가 폐호흡합니다.");
    }
}