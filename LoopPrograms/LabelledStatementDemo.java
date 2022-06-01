package LoopPrograms;

public class LabelledStatementDemo {

    void show2() {
        first:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1) {
                    continue first;
                }
                System.out.println("( i = " + i + ", j = " + j + " )");
            }
        }
        System.out.println();

        second:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1) {
                    break second;
                }
                System.out.println("( i = " + i + ", j = " + j + " )");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LabelledStatementDemo ls = new LabelledStatementDemo();
        ls.show2();
    }
}
