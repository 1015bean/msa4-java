// 연산자

package com.msa4java.edu;

public class E02Operator {
    private static Object Sytem;

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        // 대입연산자
        int sum = num1 + num2;
        int minus = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;   // int는 정수형이므로 소숫점 자리는 짤림
        System.out.println(divide); // 소숫점까지 정확히 계산하고 싶으면, double/double로 계산
        int mod = num1 % num2;

        // 산술대입연산자
        num1 += 1;
        num1 -= 1;
        num1 *= 5;
        num1 /= 5;
        num1 %= 2;

        // 증감연산자
        num1++;
        ++num1;
        num1 = 0;
        System.out.println((num1++));
        System.out.println((num1));

        // 비교 연산자
        num1 = 1;
        num2 = 2;
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 != num2);

        // 문자열의 비교
        String str = "자바";
        System.out.println(str.equals("자바"));

        // 논리 연산자
        System.out.println(num1 == num2 && num1 > 3); // 전부 true여야 true 반환
        System.out.println(num1 == num2 || num1 > 3); // 하나라도 true면 true 반환
        System.out.println(!(num1 == num2)); // 연산의 결과를 역전해서 반환

        // 삼항 연산자
        // 조건식 ? 참일 경우 실행식 : 거짓일 경우 실행식
        String result = num1 > num2 ? "num1이 큼" : "아아";
        System.out.println(result);
    }
}
