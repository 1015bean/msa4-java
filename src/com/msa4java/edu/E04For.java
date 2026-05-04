package com.msa4java.edu;

public class E04For {
    public static void main(String[] args) {

        // 구구단 출력하기
        for (int dan = 2; dan < 10; dan++) {
            System.out.println("** " + dan + "단 **");

            String strDan = String.format("** %d단 **", dan); // 스트링 메소드 이용
            System.out.println(strDan);

            for(int i = 1; i < 10; i++) {
                System.out.println(dan + " X " + i +" = " + dan * i);

                String strMulti = String.format("%d X %d = %d", dan, i, dan * i); // 스트링 메소드 이용
                System.out.println(strMulti);
            }
        }
    }
}
