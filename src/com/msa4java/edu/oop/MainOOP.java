package com.msa4java.edu.oop;

public class MainOOP {
    public static void main(String[] args) {
        // Whale 클래스를 인스턴스 생성
        // 데이터타입(클래스명그대로) 변수명 = new 생성자(클래스명());
        Whale whale = new Whale();

        System.out.println(whale.name);
        whale.swimming();

        // -----------------------------------------------------
        // static으로 생성한 필드&메소드는 따로 인스턴스화 하지 않아도 사용가능(클래스명으로 바로 호출)
        // 이 경우 인스턴스한 변수(whale)로는 호출 불가능
        // 보통은 인스턴스용 클래스 / 스태틱용 클래스 구분해 작성
        System.out.println(Whale.age);
        Whale.breath("고래");

        // -----------------------------------------------------
        // 오버로딩 테스트
        Overloading overloading = new Overloading();
        overloading.print();
        overloading.print('a');
        overloading.print(1, 2);
    }
}
