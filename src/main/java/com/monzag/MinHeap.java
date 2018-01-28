package com.monzag;

public class MinHeap {

    private static final int TOP = 0;

    private int[] heap;
    private int maxSize;
    private int size;

    public MinHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.heap = new int[this.maxSize];
    }

    private int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    private int getParentIndex(int childIndex) {
        return (childIndex - 1)/2;
    }

    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    private boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    public int leftChild(int index) {
        return heap[getLeftChildIndex(index)];
    }

    public int rightChild(int index) {
        return heap[getRightChildIndex(index)];
    }

    public int parent(int index) {
        return heap[getParentIndex(index)];
    }

    public void swap(int firstIndex, int secondIndex) {
        int temp = heap[firstIndex];
        heap[firstIndex] = heap[secondIndex];
        heap[secondIndex] = temp;
    }

    public int peek() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        return heap[TOP];
    }

    public int pool() {
        if (size == 0) {
            throw new IllegalStateException();
        }

        int root = heap[TOP];
        heap[TOP] = heap[size-1];
        size--;
        heapifyDown();
        return root;
    }

}
