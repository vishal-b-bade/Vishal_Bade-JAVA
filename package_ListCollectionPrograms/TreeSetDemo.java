package package_ListCollectionPrograms;

import java.util.*;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Dipak");
        ts.add("");
        ts.add("Bade");
        ts.add("");
        ts.add("dipak");
        ts.add("Vishal");
        ts.add("Prashant");
        ts.add("Vishal1");
        ts.add("vishal");

        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
        System.out.println(ts);
    }
}
