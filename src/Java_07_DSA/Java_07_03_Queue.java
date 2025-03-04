package Java_07_DSA;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Java_07_03_Queue {
    public static void main(String[] args) {
        Queue<String> name = new LinkedList<>();
        name.offer("mamun");
        name.offer("opu");
        System.out.println("after offer "+ name);
        name.poll();
        System.out.println("after poll " + name);
        name.offer("hello");
        name.offer("world");
        name.offer("abdullah");
        name.offer("al mamun");
        System.out.println("after offer " + name);

        Queue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        System.out.println("Initial Queue " + pq);

        pq.remove("Geeks");

        System.out.println("After Remove " + pq);

        System.out.println("Poll Method " + pq.poll());

        System.out.println("Final Queue " + pq);
    }
}
