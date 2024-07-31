package Interface.com;

import java.util.Scanner;

@FunctionalInterface
interface area{
    double circle_area(int r);
}
public class AreaCircle {
    public static void main(String[] args) {
        area a=(int r)->3.14*r*r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        System.out.println(a.circle_area(sc.nextInt()));
    }
}
