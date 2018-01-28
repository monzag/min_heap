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

    @Test
    void peekForEmptyTest() {
        assertThrows(IllegalStateException.class, () -> heap.peek());
    }

    @Test
    void peekTest() {
        addDataToHeap();
        int expect = 0;
        assertEquals(expect, heap.peek());
    }

    @Test
    void addTest() {
        heap.add(3);
        heap.add(5);
        heap.add(1);
        heap.add(2);
        heap.add(4);
        String expect = "1 2 3 5 4 0 0 0 0 0";
        assertEquals(expect, heap.toString());
    }

    private void addDataToHeap() {
        for (int i = 0; i <= 10; i++) {
            heap.add(i);
        }
    }

}