package com.malcolmsanatomy.heap;

import java.util.ArrayList;
import java.util.List;

public class PowerOfTwoMaxHeap {
    private int k;  // Number of children per node (2^k)
    private List<Integer> heap;

    public PowerOfTwoMaxHeap(int k) {
        this.k = k;
        this.heap = new ArrayList<>();
    }

    private int parent(int i) {
        return (i - 1) / k;
    }

    private int child(int i, int j) {
        return k * i + j + 1;
    }

    private void heapifyUp(int index) {
        int parentIndex = parent(index);
        if (index > 0 && heap.get(index) > heap.get(parentIndex)) {
            swap(index, parentIndex);
            heapifyUp(parentIndex);
        }
    }

    private void heapifyDown(int index) {
        int maxIndex = index;
        for (int i = 1; i <= k; i++) {
            int childIndex = child(index, i - 1);
            if (childIndex < heap.size() && heap.get(childIndex) > heap.get(maxIndex)) {
                maxIndex = childIndex;
            }
        }
        if (maxIndex != index) {
            swap(index, maxIndex);
            heapifyDown(maxIndex);
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    public int popMax() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        int maxValue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        if (!heap.isEmpty()) {
            heapifyDown(0);
        }
        return maxValue;
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }
}

