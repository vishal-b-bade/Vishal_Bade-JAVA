package package_LambdaExpressionPrograms;

import java.util.*;

public class LambdaExpressionLoopDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Vishal");
        list.add("Dipak");
        list.add("Prashant");
        list.add("Prathmesh");
        list.add("Umakant");

        list.forEach((n) -> System.out.println(n));
    }
}
