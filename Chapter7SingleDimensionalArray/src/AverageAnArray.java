package Chapter7SingleDimensionalArray.src;

import javax.swing.*;
import java.util.*;

import java.util.Arrays;

public class AverageAnArray {

    public static void main(String[] args) {
        int [] integerValues = getIntegerValues();
        double [] doubleValues = getDoubleValues();
        System.out.printf("The average for Integers is" +  " " + average(integerValues));
        System.out.printf("\nThe average for Doubles is" + " " + average(doubleValues));
    }

    public static int [] getIntegerValues(){
        Scanner s = new Scanner(System.in);
        int [] values = new int[10];
        System.out.print("Enter 10 integer values with a space in between: ");
        for(int i = 0; i < values.length; i++){
            values[i] = s.nextInt();
        }
        return values;
    }

    public static double [] getDoubleValues(){
        System.out.print("Enter in 10 double values with a space in between: ");
        Scanner s = new Scanner(System.in);
        double [] values = new double [10];
        for(int i = 0; i < values.length; i++){
            values[i] = s.nextDouble();
        }
        return values;
    }

    public static double average(int [] arr) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static double average(double [] arr){
        double sum = 0.0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;
    }

}
