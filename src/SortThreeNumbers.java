import java.util.*;

public class SortThreeNumbers {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double number3 = sc.nextDouble();
        System.out.println("Those numbers in increasing order are");
        displaySortedNumbers(number1, number2, number3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3){
        double lowest = 0;
        double middle = 0;
        double highest = 0;

        if(num1 < num2 && num1 < num3){
            lowest = num1;
            if(num2 < num3){
                middle = num2;
                highest = num3;
                System.out.println(lowest + " " + middle + " " + highest);
            }
            else {
                middle = num3;
                highest = num2;
                System.out.println(lowest + " " + middle + " " + highest);
            }
        }
        else if(num2 < num1 && num2 < num3){
            lowest = num2;
            if(num1 < num3){
                middle = num1;
                highest = num3;
                System.out.println(lowest + " " + middle + " " + highest);
            }
            else {
                middle = num3;
                highest = num1;
                System.out.println(lowest + " " + middle + " " + highest);
            }
        }
        else if(num3 < num1 && num3 < num2){
            lowest = num3;
            if(num1 < num2){
                middle = num1;
                highest = num2;
                System.out.println(lowest + " " + middle + " " + highest);
            }
            else {
                middle = num2;
                highest = num3;
                System.out.println(lowest + " " + middle + " " + highest);
            }
        }
    }

}
