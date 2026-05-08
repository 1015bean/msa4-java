package com.msa4java.edu.generics;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {
        Box1 box1 = new Box1();
        box1.add(2);
        box1.add(5);
        Box1Str box1Str = new Box1Str();
        box1Str.add("test");

        System.out.println(Arrays.toString(box1.arr));

        Box2<String> box2 = new Box2<String>();
        box2.add("test");

        Box2<Integer> box2Int = new Box2<Integer>();
        box2Int.add(1);

        List<LocalDateTime> list1 = new ArrayList<LocalDateTime>(10);
        list1.add(LocalDateTime.now());
        list1.add(LocalDateTime.of(2026, 5, 8, 17, 20, 10));
    }
}
