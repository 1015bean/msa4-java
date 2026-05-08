package com.msa4java.edu.generics;

public class Box2<T>{
    public T[] arr = (T[]) new Object[10];
    public int nowIdx = 0;

    public void add(T val) {
        this.arr[nowIdx] = val;
        nowIdx++;
    }
}
