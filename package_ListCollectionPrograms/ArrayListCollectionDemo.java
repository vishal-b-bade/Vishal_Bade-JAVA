package package_ListCollectionPrograms;

import java.util.*;

public class ArrayListCollectionDemo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // Creating Array List.
        list.add("Vishal"); // Adding Object in Array List.
        list.add("Prashant");
        list.add("Prathmesh");
        list.add("Gajanan");
        list.add("Shubham");

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
