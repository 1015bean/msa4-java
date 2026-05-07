package com.msa4java.edu.oop.abstrsact;

public class Whale extends Mammal implements Swim {

    public Whale(String name) {
        super(name, "바다");
    }

    @Override
    public void residence() {
        System.out.println(this.name + " " + this.residence + "에 삽니다.");
    }

    @Override
    public void breath() {
        System.out.println("고래쪽에서 오버라이드");
    }

    public void swimming() {
        System.out.println(this.name + "육중하게 헤엄칩니다.");
    }
}
