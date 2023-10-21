package edu.vwcc.queue;

public class Queue<E> implements Queueable<E> {
	
    private Node<E> head; // use as front of the queue
    
    private Node<E> tail; // use as rear of the queue
    
    // Method to add an element to the queue (enqueue)
	@Override
	public void enqueue(E value) {
		// TODO:
		
		// 1. Create a new Node with the parameter of type E
		
		// 2. If Queue is empty, assign both head and tail to this new Node
		
		// 3. If Queue is not empty, make the new Node the tail (don't forget to link to it first)
		
		String[] E;
		int size = 0;
		if (size == E.length) 
			{ throw new IllegalStateException(); }
		else {
			size++;
			// enqueue value
		}
	}
	
	
    // Method to remove an element from the queue (dequeue)
	@Override
	public void dequeue() {
		// TODO
		
		// 1. If Queue is empty, do nothing
		
		// 2. If Queue is NOT empty, remove the first Node from the Queue
	}
	
	
    // Method to view the front element of the queue (peek)
	@Override
	public E peek() {
		// TODO 
		return null;
	}
	
	
	@Override
	public int size() {
		// TODO
		return 0; // update
	}
	
	
	// The following two helper methods have already been written for you
	// No need to change them, but you can if you want 
	
	// return true if this Queue is empty
	@Override
	public boolean isEmpty() {
		return head == null;
	}	

	// print out all contents of Queue
	@Override
	public void print() {
	    Node<E> current = head;
	    while (current != null) {
	        System.out.println(current.value);
	        current = current.next;
	    }
	}
    
}
