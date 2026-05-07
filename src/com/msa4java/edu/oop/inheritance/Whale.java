package com.msa4java.edu.oop.inheritance;

// extends: 해당 클래스를 부모 클래스로 삼음, 상속 관계를 만듦
public class Whale extends Mammal{

    public Whale(String name, String residence) {
        // super 메소드가 생략돼있음
        // super() : 부모의 생성자를 호출하는 메소드
        super(name, residence);
    }

    // 오버라이딩: 부모에게 상속받은 메소드를 자식이 재정의하여 사용하는 것
    @Override
    public void breath() {
        // super 키워드: 부모 클래스로부터 상속받은 필드&메소드를 자식 클래스가 참조하기 위해 사용하는 참조변수
        super.breath();
        System.out.println(this.name + "이/가 끝내주게 헤엄칩니다.");
    }

    public void swiming() {
        System.out.println(this.name + "이/가 헤엄칩니다.");
    }
}
