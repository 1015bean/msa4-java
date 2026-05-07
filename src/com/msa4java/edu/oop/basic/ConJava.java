package com.msa4java.edu.oop.basic;

public class ConJava {
    public int age;
    // 생성자 (Construct)
    // 클래스를 인스턴스화 할 때, 딱 한 번만 실행되는 '메소드'
    public ConJava(int age) {
        this.age = age;
        this.test();
    }

    private void test() {
        System.out.println("테스트 실행됨");
    }
}
