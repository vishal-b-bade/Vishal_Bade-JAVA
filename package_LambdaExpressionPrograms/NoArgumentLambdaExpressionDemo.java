package package_LambdaExpressionPrograms;

interface Drawable {

    public void draw();
}

public class NoArgumentLambdaExpressionDemo {

    public static void main(String[] args) {
        Drawable d2 = () -> {
            int w = 10;
            System.out.println("Drawing : " + w);
        };
        d2.draw();
    }
}
