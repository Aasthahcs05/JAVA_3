package unit3;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        Deque <String> dq=new java.util.ArrayDeque<>();
        dq.add("First");
        dq.addFirst("Zero");
        dq.addLast("One");
        System.out.println(dq.getLast());
        System.out.println(dq.getFirst());
        System.out.println((dq));
        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());
    }
}
