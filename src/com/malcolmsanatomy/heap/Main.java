package com.malcolmsanatomy.heap;

public class Main {
    public static void main(String[] args) {
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(2); // Binary heap (2^2 = 4 children per node)
        
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(7);
        heap.insert(30);

        System.out.println("Max value removed: " + heap.popMax()); // Should print 30
        System.out.println("Max value removed: " + heap.popMax()); // Should print 20
    }
}

