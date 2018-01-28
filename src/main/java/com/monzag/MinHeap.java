package com.monzag;

public class MinHeap {

    private int[] heap;
    private int maxSize;
    private int size;

    public MinHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.heap = new int[this.maxSize];
    }
}
