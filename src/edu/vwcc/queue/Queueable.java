package edu.vwcc.queue;

public interface Queueable<E> {
    // Method to add an element to the queue (enqueue)
    void enqueue(E value);

    // Method to remove an element from the queue (dequeue)
    void dequeue();

    // Method to get the front element of the queue (peek)
    E peek();

    // Method to check if the queue is empty
    boolean isEmpty();

    // Method to get the size of the queue
    int size();

    // Method to print the queue
    void print();
}
