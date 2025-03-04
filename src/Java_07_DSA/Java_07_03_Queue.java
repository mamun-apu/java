package Java_07_DSA;

import java.util.LinkedList;
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


    }
}
