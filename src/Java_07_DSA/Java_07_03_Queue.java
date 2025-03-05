package Java_07_DSA;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Java_07_03_Queue {
    public static void main(String[] args) {
        // Using LinkedList to demonstrate basic Queue operations
        Queue<String> name = new LinkedList<>();
        name.offer("mamun");
        name.offer("opu");
        System.out.println("After offer " + name);

        // Poll an element from the queue
        name.poll();
        System.out.println("After poll " + name);

        // Offer more elements
        name.offer("hello");
        name.offer("world");
        name.offer("abdullah");
        name.offer("al mamun");
        System.out.println("After offering more elements " + name);

        // Check if a specific element exists in the queue
        System.out.println("Contains 'hello': " + name.contains("hello"));
        System.out.println("Queue size: " + name.size());

        // Peek the first element without removing it
        System.out.println("Peek first element: " + name.peek());

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + name.isEmpty());

        // Using PriorityQueue to demonstrate priority-based queue operations
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");
        System.out.println("Initial PriorityQueue: " + pq);

        // Remove a specific element
        pq.remove("Geeks");
        System.out.println("After Remove 'Geeks': " + pq);

        // Poll an element (removes and returns the head of the queue)
        System.out.println("Poll Method: " + pq.poll());

        // Display the final PriorityQueue
        System.out.println("Final PriorityQueue: " + pq);

        // Add more elements to demonstrate PriorityQueue behavior
        pq.add("Apple");
        pq.add("Banana");
        pq.add("Cherry");

        System.out.println("Updated PriorityQueue: " + pq);

        // Check size of the PriorityQueue
        System.out.println("PriorityQueue size: " + pq.size());

        // Peek the first element in the priority queue
        System.out.println("Peek first element in PriorityQueue: " + pq.peek());
    }
}
