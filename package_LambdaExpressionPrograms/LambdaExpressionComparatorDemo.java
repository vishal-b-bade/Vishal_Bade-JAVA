package package_LambdaExpressionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Products {

    int id;
    String name;
    float price;
    int warrenty;

    public Products(int id, String name, float price, int warrenty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warrenty = warrenty;
    }
}

public class LambdaExpressionComparatorDemo {

    public static void main(String[] args) {
        List<Products> list = new ArrayList<>();

        list.add(new Products(1, "Dell Laptop", 80000f, 2));
        list.add(new Products(2, "Apple Mobile", 100000f, 4));
        list.add(new Products(3, "Keyboard", 1200f, 1));

        System.out.println("Sorting on the Basis on Name :");

        Collections.sort(list, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });
        for (Products p : list) {
            System.out.println(p.id + " " + p.name + " " + p.price + " " + p.warrenty);
        }
    }
}
