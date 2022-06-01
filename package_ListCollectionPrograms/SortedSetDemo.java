package package_ListCollectionPrograms;

import java.util.*;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<Integer> ss=new TreeSet<>();
        ss.add(0);
        ss.add(10);
        ss.add(10);
        ss.add(20);
        ss.add(40);
        ss.add(60);
        ss.add(50);
        ss.add(30);
        
        Iterator<Integer> itr=ss.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
        System.out.println(ss);
        
        SortedSet<String> ss1=new TreeSet<>();
        ss1.add("Vishal");
        ss1.add("Bade");
        ss1.add("Dipak");
        ss1.add("Pradip");
        ss1.add("Prashant");
        ss1.add("Visha12");
        ss1.add("PRADIP");
        ss1.add("PRADIP");
        ss1.add("");
        
        Iterator<String> itr1=ss1.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
            
        }
        System.out.println(ss1);
    }
}
