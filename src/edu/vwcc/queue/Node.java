package edu.vwcc.queue;

public class Node<V> {
    V value;
    Node<V> next;

    // Node constructor
    public Node(V value) {
        this.value = value;
        this.next = null;
    }
}

