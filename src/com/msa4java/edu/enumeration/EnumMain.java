package com.msa4java.edu.enumeration;

public class EnumMain {
    public static void main(String[] args) {
        Week day = Week.MONDAY;
        System.out.println(day);
        System.out.println(day.name());   // .name(): 상수이름 반환해주는 기본제공 메소드
        System.out.println(day.getKrDay());
    }
}
