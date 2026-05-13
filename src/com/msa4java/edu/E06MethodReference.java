package com.msa4java.edu;

import java.util.Arrays;
import java.util.List;

public class E06MethodReference {
    public static void main(String[] args) {
        // 메소드 참조
            // 예시1
        List<Integer> list = Arrays.asList(1, 2, 3, 4);   // 배열 생성
            // 람다식 이용
        list.forEach(i -> System.out.println(i));
            // 메소드 참조 이용
        list.forEach(System.out::println);

            // 예시2
        List<String> strList = Arrays.asList("Hong", "Dull");
            // 람다식
        strList.forEach(str -> str.toUpperCase());   //.toUpperCase(): 문자열 대문자로 변경
            // 메소드 참조
        strList.forEach(String::toUpperCase);
    }

}
