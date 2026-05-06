package com.msa4java.edu.oop;

// oop -> 클래스와 객체
// class(객체의 기본 틀) 생성 후 클래스를 참고하는 객체 생성

public class Whale {
        // Class는 Field(속성)와 Method로 구성되어 있다.

        // Field
        public String name = "고래";
        public static int age = 10;

        // Method
        public void swimming() {
            System.out.println("헤엄칩니다.");
        }
        public static void breath(String str) {
            System.out.println(str + "가 호흡합니다.");
        }

}
