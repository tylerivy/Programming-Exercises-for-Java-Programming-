package Chapter7SingleDimensionalArray.src;

import java.util.*;

public class FindSmallestElement {

    public static void main(String[] args) {
        double [] doubleValues = getDoubleValues();
        sortArray(doubleValues);
        System.out.println("The minimal value is " + "" + doubleValues[0]);
    }

    public static double [] getDoubleValues(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter in 10 double values with a space in between: ");
        double [] values = new double[10];
        for(int i = 0; i < values.length; i++){
            values[i] = s.nextDouble();
        }
        return values;
    }

    public static void sortArray(double [] arr){
        for(int i = 0; i < arr.length -1; i++){
            double minValue = arr[i];
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(minValue > arr[j]){
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            if(minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = minValue;
            }
        }
    }
}
