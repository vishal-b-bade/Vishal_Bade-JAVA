/* Area Calculator Given 6 Shapes -> Triangle, Square, Rectangle, Parallelogram, Circle, Semi-Circle */

package vb_projects;

import java.util.Scanner;

public class Area_Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("                                                              --------------------");
        System.out.println("                                                                AREA CALCULATOR ");
        System.out.println("                                                              --------------------");

        System.out.println("When Choice : Triangle = Enter -> 1, Square = Enter -> 2, Rectangle = Enter -> 3, Parallelogram = Enter -> 4, Circle = Enter -> 5, Semi-Circle = Enter -> 6 .");
        int choose = sc.nextInt();
        switch (choose) {

            case 1:

                System.out.println("Enter the Base value of Triangle :");
                double base = sc.nextDouble();
                System.out.println("Enter the Height value of Triangle :");
                double height = sc.nextDouble();
                double area = 1 / 2.0 * base * height;
                System.out.println("Area of Triangle = " + area);
                break;

            case 2:

                System.out.println("Enter the Side Value of Length of Square :");
                double length = sc.nextDouble();
                area = length * length;
                System.out.println("Area of Square = " + area);
                break;

            case 3:

                System.out.println("Enter the Width value of Rectangle :");
                double width = sc.nextDouble();
                System.out.println("Enter the Height value of Rectangle :");
                double height1 = sc.nextDouble();
                area = width * height1;
                System.out.println("Area of Rectangle = " + area);
                break;

            case 4:

                System.out.println("Enter the Base value of Parallelogram :");
                double base1 = sc.nextDouble();
                System.out.println("Enter the Vertical Height value of Parallelogram :");
                double vertical_height = sc.nextDouble();
                area = base1 * vertical_height;
                System.out.println("Area of Parallelogram = " + area);
                break;

            case 5:

                System.out.println("Enter the Radius value of Circle :");
                double radius = sc.nextDouble();
                area = Math.PI * radius * radius;
                System.out.println("Area of Circle = " + area);
                break;

            case 6:

                System.out.println("Enter the Radius value of Semi-Circle :");
                double radius1 = sc.nextDouble();
                area = (Math.PI * radius1 * radius1) / 2.0;
                System.out.println("Area of Semi-Circle = " + area);
                break;

            default:
                System.out.println("Please Enter The Valid Option..");

        }
    }
}
