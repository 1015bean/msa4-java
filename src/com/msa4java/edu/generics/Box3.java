package com.msa4java.edu.generics;

import java.util.ArrayList;
import java.util.List;

public class Box3 <T, S>{
    public List<T> item = new ArrayList<>(10);

    private S value;

    public S test() {
        return value;
    }
}
