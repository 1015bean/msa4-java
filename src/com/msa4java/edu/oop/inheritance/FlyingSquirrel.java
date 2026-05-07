package com.msa4java.edu.oop.inheritance;

public class FlyingSquirrel extends Mammal{

    public FlyingSquirrel(String name, String residence) {
        // super메소드가 생략돼있음
        // super() : 부모의 생성자를 호출하는 메소드
        super(name, residence);
    }

    public void flying() {
        System.out.println(this.name + "이/가 날아갑니다.");
    }
}
