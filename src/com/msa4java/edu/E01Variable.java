// 변수와 상수/데이터타입

package com.msa4java.edu;

public class E01Variable {
    public static void main(String[] args) {

        // 변수 선언
        // 데이터타입/객체타입 변수명(소문자);
        int age;
        age = 1;
        String name = "홍길동";  // String 객체(첫글자 대문자) : "문자열"
        char ch = 'a';  // char 데이터타입(첫글자 소문자) : '문자(1자)'

        // 상수 선언
        // final 데이터타입/객체타입 변수명(대문자) = 값;
        final String USER_NAME = "길동이";

        // Underscore 표기법
        int num2 = 200_000_000;  // = 200000000

        // 두 변수의 값을 스와핑: 새로운 변수(tmp)를 생성
        int swap1 = 1;
        int swap2 = 2;
        int tmp;

        tmp = swap2;
        swap2 = swap1;
        swap1 = tmp;

//        ---------------------------------------------------------------------------
        // 데이터타입
        boolean boo = false;

        byte bt = 125;
        short st = 32584;
        int integer = 214735464;
        long longer = 1L; // 숫자 뒤에 L 붙인다

        double db = 3.141592;
        float ft = 3.141592F; // 숫자 뒤에 F를 붙인다

        char ch2 = 'a';

        // 스트링의 비교
        String str1 = "홍길동";
        String str2 = "홍길동";
        System.out.println(str1 == str2); // true 출력. 올바르지 않은 방법
        System.out.println(str1.equals(str2)); // String객체 문자비교 메소드: str.equals()

    }
}
