package package_ListCollectionPrograms;

import java.util.*;

public class ArrayDequeDemo {

    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();

        dq.addLast("Last");
        dq.add("aaa");
        dq.add("bbb");
        dq.addFirst("First");
        dq.add("ccc");
        dq.add("eee");
        dq.add("Current Added");
        dq.add("ddd");
        dq.offer("1");
        dq.offerLast("3");
        dq.offerFirst("2");

        for (String str : dq) {
            System.out.println(str);
        }
        System.out.println(dq);
    }
}
