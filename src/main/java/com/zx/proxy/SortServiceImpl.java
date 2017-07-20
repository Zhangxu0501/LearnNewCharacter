package com.zx.proxy;

import java.util.Arrays;

public class SortServiceImpl implements SortService{
    public int[] sort(int [] array) {
        Arrays.sort(array);
        return array;
    }
}
