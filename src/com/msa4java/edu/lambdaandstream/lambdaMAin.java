package com.msa4java.edu.lambdaandstream;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class lambdaMAin {
    public static void main(String[] args) {
        MyAddinterface myAddinterface = (a, b) -> a + b;

        myAddinterface.plus(1, 2);

        //-------------------------------------------------------------------------
        // 스트림
        List<String> list = new ArrayList<>();
        list.add("길동");
        list.add("둘리");
        list.add("도우너");
        list.add("또치");

        // 1. 스트림 활용
        Stream<String> stream = list.stream();         // 스트림타임 리스트 생성; .stream(): 스트림 객체화하는 메소드
        List<String> newList = stream.map(name -> {        // stream.map(): 스트림의 메소드 map활용해 반복처리
            return "이름:" + name;
        }).toList();                   // List<String> newList = stream.toList();
                                       // : 처리된 결과(스트림타입)를 리스트 타입으로 돌림, 체인메소드 작성하듯이 작성
        // 2. for문 활용
//        for(String s : list) {
//            newList.add("이름:" + s);
//        }
    }

    //-------------------------------------------------------
    // 일반적인 메소드
    public int add(int a, int b) {
        return a + b;
    }

    // 위 메소드를 람다식으로 표현
    // (a, b) -> { return a + b; }
    // (a, b) -> a + b;              처리식 간단하므로 중괄호 생략 가능

}
