package package_ListCollectionPrograms;

import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Vishal Bade");
        pq.add("Dipak Lodwal");
        pq.add("Umakant Kathar");
        pq.add("Prathmesh Chaudhari");
        pq.add("Shubham Chilvant");
        pq.add("Prashant Chandge");
        pq.add("Gajanan Deshmukh");

        System.out.println("Head : " + pq.element());
        System.out.println("Head : " + pq.peek());
        System.out.println("Iterating The Queue Elements ");

        Iterator itr = pq.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        pq.remove();
        pq.poll();
        System.out.println("After Removing Two Elements :");

        Iterator itr2 = pq.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
