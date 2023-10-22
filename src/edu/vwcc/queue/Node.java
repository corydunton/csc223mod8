package edu.vwcc.queue;

public class Node<V> {
	
	V value;
	Node<V> next;

	// Node constructor
	public Node(V value) {
		this.value = value;
		this.next = null;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public Node<V> getNext() {
		return next;
	}

	public void setNext(Node<V> next) {
		this.next = next;
	}
}
