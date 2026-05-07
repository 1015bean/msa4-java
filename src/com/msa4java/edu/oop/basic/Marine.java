package com.msa4java.edu.oop.basic;

public class Marine {
    private int hp;
    private int damage;
    private int armor;

    // this() 메소드 & this 참조 변수
        // Marine(생성자)의 초기값을 커스텀으로 설정해주기 위해, this() 메소드 사용
        // Marine메소드 안에서 this메소드( =Marine() )를 실행
    public Marine() {
        this(40, 6, 0);
    }

    public Marine(int hp, int armor) {
        this(hp, 6, armor);
    }

    public Marine(int hp, int damage, int armor) {
        this.hp = hp;
        this.damage = damage;
        this.armor = armor;
    }

    // getter 메소드
    // private으로 되어있는 요소의 값을 알고 싶을 때 사용
    public int getHp() {
        return this.hp;
    }
    public int getArmor() {
        return this.armor;
    }

    public int getDamage() {
        return this.damage;
    }

    // setter 메소드
    // private 로 되어있는 요소를 외부파일에서 변경하고 싶을 때 사용
    public void setHp(int hp) {
        this.hp = hp;
    }
}
