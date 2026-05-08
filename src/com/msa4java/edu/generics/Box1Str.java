package com.msa4java.edu.generics;

public class Box1Str {
    public String[] arr = new String[10];
    private int nowIdx = 0;

    public void add(String val) {
        this.arr[nowIdx] = val;
        nowIdx++;
    }
}
