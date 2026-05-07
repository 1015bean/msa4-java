package com.msa4java.edu.oop.abstrsact;

public class FlyingSquirrel extends Mammal{

    public FlyingSquirrel(String name) {
        super(name, "숲");
    }

    @Override
    public void residence() {
        System.out.println(this.name + " " + this.residence + "에 삽니다.");
    }
}
