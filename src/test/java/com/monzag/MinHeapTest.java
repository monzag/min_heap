package com.monzag;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class MinHeapTest {

    private MinHeap heap;

    @BeforeEach
    public void createHeap() {
        heap = new MinHeap(10);
    }
}