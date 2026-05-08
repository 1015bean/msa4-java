package com.msa4java.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);  // 타입 List로 업캐스팅하여 인스턴스화(List의 메소드를 이용하기 위함)
        List<String> list2 = new ArrayList<>(10);

        class MyArrayList {
            private int[] arr = new int[10];
        }

        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);

        System.out.println(list.get(3));   // ArrayList의 요소를 출력

        Collections.sort(list);            // ArrayList list를 오름차순 정렬
        System.out.println(list.get(3));
        System.out.println(list.size());   // ArrayList list에 저장된 요소의 개수를 반환(length와 비슷?)

        // 향상된 for문: for문의 조건으로 배열의 요소들을 넣어줌
        for(int i : list) {
            System.out.println(i);
        }

        list.forEach((i) -> {
            System.out.println(i);
        });
    }
}
