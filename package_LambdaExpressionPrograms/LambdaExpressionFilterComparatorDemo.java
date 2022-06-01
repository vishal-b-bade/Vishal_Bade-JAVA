package package_LambdaExpressionPrograms;

import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.List;

class Products {

    int id;
    String name;
    float price;

    public Products(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}

public class LambdaExpressionFilterComparatorDemo {

    public static void main(String[] args) {
        List<Products> list = new ArrayList<>();

        list.add(new Products(1, "Sangsung A5", 17000f));
        list.add(new Products(2, "Iphone 6s", 65000f));
        list.add(new Products(3, "Sony Xperia", 25000f));
        list.add(new Products(4, "Nokia Lumia", 15000f));
        list.add(new Products(5, "Redmi Note 9", 28000f));
        list.add(new Products(6, "Lenovo Vibe", 18000f));

        Stream<Products> filterData = list.stream().filter(p -> p.price >= 20000);

        filterData.forEach(Products -> System.out.println(Products.id + " " + Products.name + " " + Products.price));
    }
}
