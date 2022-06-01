package package_LambdaExpressionPrograms;

interface StringFuntion {

    String run(String s);
}

public class LambdaWithStringDemo {

    public static void main(String[] args) {
        StringFuntion ex = (s) -> s + "!";
        StringFuntion ex1 = (s) -> s + "?";
        printFormatted("Hello", ex);
        printFormatted("Hello", ex1);
    }

    private static void printFormatted(String ex, StringFuntion format) {
        String result = format.run(ex);
        System.out.println(result);
    }
}
