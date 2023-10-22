package edu.vwcc.queue;

public class Queue<E> implements Queueable<E> {

	private Node<E> head; // use as front of the queue
	private Node<E> tail; // use as rear of the queue

	// Method to add an element to the queue (enqueue)
	@Override
	public void enqueue(E value) {
		// 1. Create a new Node with the parameter of type E
		Node<E> newNode = new Node<>(value);

		// 2. If Queue is empty, assign both head and tail to this new Node
		if (isEmpty()) {
			head = tail = newNode;
			System.out.println("Plane added to run way queue.");
		} else {
			// 3. If Queue is not empty, make the new Node the tail (don't forget to link to
			// it first)
			tail.setNext(newNode);
			tail = newNode;
			System.out.println("Plane added to run way queue.");
		}
	}

	// Method to remove an element from the queue (dequeue)
	@Override
	public void dequeue() {
		// 1. If Queue is empty, do nothing
		if (isEmpty()) {
			return;
		}

		// 2. If Queue is NOT empty, remove the first Node from the Queue
		head = head.getNext();

		if (head == null) {
			tail = null;
		}
		System.out.println("Take off successful!");
	}

	// Method to view the front element of the queue (peek)
	@Override
	public E peek() {
		if (isEmpty()) {
			return null;
		}

		return head.getValue();
	}

	@Override
	public int size() {
		int count = 0;
		Node<E> current = head;

		while (current != null) {
			count++;
			current = current.getNext();
		}

		return count;
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

		if (isEmpty()) {
			System.out.println("All clear!");
			return;
		}

		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}
}
