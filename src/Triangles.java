import java.util.*;

public class Triangles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 sides of triangle: ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();




        if(isValid(side1, side2, side3)){
            System.out.println("The area of the triangle is " + area(side1, side2, side3));
        }
        else {
            System.out.println("Those are not valid inputs");
        }
    }

    public static boolean isValid(double s1, double s2, double s3){
        return (s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1);
    }

    public static double area(double s1, double s2, double s3){
        double side = (s1 + s2 + s3) / 2.0;
        double area = Math.sqrt(side * (side - s1) * (side - s2) * (side - s3));
        return area;
    }

}
