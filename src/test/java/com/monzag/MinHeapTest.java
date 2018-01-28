package com.monzag;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinHeapTest {

    private MinHeap heap;

    @BeforeEach
    public void createHeap() {
        heap = new MinHeap(10);
    }
    
    private void addDataToHeap() {
        for (int i = 0; i <= 10; i++) {
            heap.add(i);
        }
    }

}