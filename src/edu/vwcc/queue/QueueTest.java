package edu.vwcc.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    @Test
    public void testEnqueue() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        assertEquals(1, queue.peek());
    }

    @Test
    public void testDequeue() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testPeek() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        assertEquals(1, queue.peek());
    }

    @Test
    public void testIsEmpty() {
        Queue<Integer> queue = new Queue<>();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testSize() {
        Queue<Integer> queue = new Queue<>();
        assertEquals(0, queue.size());
    }

    @Test
    public void testEnqueueMultiple() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.peek());
    }

    @Test
    public void testDequeueMultiple() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        assertEquals(2, queue.peek());
    }

    @Test
    public void testSizeMultiple() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(2, queue.size());
    }

    @Test
    public void testIsEmptyFalse() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testPeekAfterDequeue() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        assertEquals(2, queue.peek());
    }
    
    @Test
    public void testDequeueEmptyQueue() {
        Queue<Integer> queue = new Queue<>();
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testSizeAfterEnqueueAndDequeue() {
        Queue<Integer> queue = new Queue<>();
        assertEquals(0, queue.size());

        queue.enqueue(1);
        assertEquals(1, queue.size());

        queue.enqueue(2);
        assertEquals(2, queue.size());

        queue.dequeue();
        assertEquals(1, queue.size());

        queue.dequeue();
        assertEquals(0, queue.size());

        queue.dequeue();
        assertEquals(0, queue.size());
    }

}

