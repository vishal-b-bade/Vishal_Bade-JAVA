package package_ListCollectionPrograms;

import java.util.*;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<>();
        al.add("Mumbai");
        al.add("Pune");
        al.add("Aurangabad");
        al.add("Jalna");
        al.add("Ambad");
        al.add("Beed");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
