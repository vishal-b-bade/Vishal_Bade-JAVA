package package_ListCollectionPrograms;

import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Vishal");
        hs.add("Vishal");
        hs.add("Dipak");
        hs.add("dipak");
        hs.add("Prashant");
        hs.add("Gajanan");
        hs.add("Umakant");
        hs.add("");
        hs.add("");

        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
        System.out.println(hs);

        HashSet<String> hs1 = new HashSet<>();
        hs1.addAll(hs);
        hs1.add("");
        hs1.add("Prathmesh");
        hs1.add("Gajanan");
        hs1.add("1");
        hs1.add("2");
        hs1.add("3");

        System.out.println(hs1);

        boolean value1 = hs1.remove("3");
        System.out.println("Is '3' Remove : " + value1);
        System.out.println(hs1);

        boolean value2 = hs.removeAll(hs);
        System.out.println("Is hs remove ? : " + value2);
        System.out.println(hs);
    }
}