package edu.vwcc.queue;

/*
 * Program: Air Traffic Control System
 * Your Name: Cory Dunton
 * Your Date: October 21, 2023
 * 
 * INSTRUCTIONS:
 * 
 * 1. Print out the current size and full contents of the planeQueue 
 * 
 * 2. Add print statements to your enqueue/dequeue methods in Queue that confirm
 *  "Plane added to run way queue" or "Take off successful!" respectively
 *  
 * 3. Dequeue three planes
 * 
 * 4. Peek at the next plane up for departure (and print its value)
 * 
 * 5. Add two new mock planes to the queue (you make up its values)
 * 
 * 6. Dequeue all planes until the queue is EMPTY
 * 
 * 7. Add a conditional check in your Queue's print method that says "All clear!" if the Queue is empty 
 * 
 * 8. EXTRA CREDIT Challenge (5 points MAX): 
 * Add a priority boolean field to the Node or Plane class, and change the enqueue method
 * so that if a Plane has a priority of True, add them to the front of the Queue for immediate take-off
 * Requirement: Your new code must be backward-compatible, i.e., not break the main method below or unit tests
 * 
 */

public class TrafficControl {
	public static void main(String[] args) {
		Queue<Plane> planeQueue = new Queue<>();

		// Adding Planes to queue
		planeQueue.enqueue(new Plane("United Airlines", "UA1010", "Boeing 747", 366));
		planeQueue.enqueue(new Plane("Emirates", "EK2020", "Airbus A380", 853));
		planeQueue.enqueue(new Plane("Delta Airlines", "DL3030", "Boeing 777", 301));
		planeQueue.enqueue(new Plane("Qatar Airways", "QR4040", "Airbus A350", 440));
		planeQueue.enqueue(new Plane("American Airlines", "AA5050", "Boeing 787", 242));

		// Print out the current size and full contents of the planeQueue
		System.out.println("The size of queue is " + planeQueue.size());
		planeQueue.print();

		// Dequeue 3 planes
		planeQueue.dequeue();
		planeQueue.dequeue();
		planeQueue.dequeue();

		// Peek at the next plane up for departure and print
		System.out.println("Next plane up for departure: " + planeQueue.peek());

		// Add 2 new planes to queue
		planeQueue.enqueue(new Plane("Amateur Airlines", "AA1233", "Cessna 172", 4));
		planeQueue.enqueue(new Plane("Amateur Airlines", "AA1234", "CubCrafters CC11-160 Carbon Cub SS", 2));

		// Dequeue all planes until queue is empty
		while (!planeQueue.isEmpty()) {
			planeQueue.dequeue();
		}

		// Print queue last time
		planeQueue.print();
	}
}