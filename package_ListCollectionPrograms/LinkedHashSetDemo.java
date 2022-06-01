package package_ListCollectionPrograms;

import java.util.*;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(0);
        lhs.add(20);
        lhs.add(30);
        lhs.add(40);
        lhs.add(50);
        lhs.add(60);
        lhs.add(0);

        Iterator<Integer> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
        System.out.println(lhs);
        
         boolean value1 = lhs.remove(30);
        System.out.println("Is '30' Remove : " + value1);
        System.out.println(lhs);

        boolean value2 = lhs.removeAll(lhs);
        System.out.println("Is hs remove ? : " + value2);
        System.out.println(lhs);
    }
}
