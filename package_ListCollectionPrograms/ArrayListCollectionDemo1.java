package package_ListCollectionPrograms;

import java.util.*;

public class ArrayListCollectionDemo1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // Creating Array List.

        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        System.out.println(list);

        for (int i = 0; i <list.size(); i++) {
            list.remove(i);
        }
        System.out.println(list);
        System.out.println(list.size());
    }

}
