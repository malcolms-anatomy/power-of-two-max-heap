package com.malcolmsanatomy.heap;

import org.junit.Test;
import static org.junit.Assert.*;

public class PowerOfTwoMaxHeapTest {
    
    @Test
    public void testInsertAndPopMax() {
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(1); // Binary heap (2^1 = 2 children per node)
        
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(30);

        assertEquals(30, heap.popMax());
        assertEquals(20, heap.popMax());
        assertEquals(10, heap.popMax());
        assertEquals(5, heap.popMax());
    }

    @Test(expected = IllegalStateException.class)
    public void testPopMaxOnEmptyHeap() {
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(2);
        heap.popMax();  // Should throw an exception
    }

    @Test
    public void testHeapifyDown() {
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(3); // 8 children per node (2^3)
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(4);
        heap.insert(6);

        assertEquals(8, heap.popMax());
    }
}

