package package_LambdaExpressionPrograms;

interface Drawable {

    public void draw();
}

public class WithoutLambdaExpressionDemo {

    public static void main(String[] args) {
        int w = 10;
        Drawable d2 = new Drawable() {
            public void draw() {
                System.out.println("Drawing : " + w);
            }
        };
        d2.draw();
    }
}
