package com.msa4java.edu.oop.basic;

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

        // -------------------------------------------------------
        // 생성자
        ConJava conJava = new ConJava(20);  // "테스트 실행됨" 출력
        ConJava conJava1 = new ConJava(35); // "테스트 실행됨" 출력

        System.out.println(conJava.age);  // "20" 출력
        System.out.println(conJava1.age); // "35" 출력

        // -------------------------------------------------------
        // this 메소드 & this 참조 변수(getter/setter 메소드)
        Marine marine = new Marine(10, 0, 25);
        System.out.println(marine.getHp()); // 10
        marine.setHp(30);
        System.out.println(marine.getHp());  // 30

        Marine marine2 = new Marine();
        System.out.println(marine2.getHp());  // 40
    }
}
