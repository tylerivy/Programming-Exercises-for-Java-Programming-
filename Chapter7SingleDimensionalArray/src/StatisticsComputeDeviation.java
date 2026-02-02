package Chapter7SingleDimensionalArray.src;

import java.util.*;

public class StatisticsComputeDeviation {

    public static void main(String[] args) {
        double [] doubleValues = getDoubleValues();
        double mean = mean(doubleValues);
        deviation(doubleValues, mean);

    }

    public static double [] getDoubleValues(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 10 double values with a space in between: ");
        double [] values = new double [10];
        for(int i = 0; i < values.length; i++){
            values[i] = s.nextDouble();
        }
        return values;
    }

    public static double mean(double [] arr){
        double sum = 0.0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("The mean is" + " " + sum / arr.length);
        return sum / arr.length;
    }

    public static double deviation(double [] arr, double mean){
        double sum = 0.0;
        for(int i = 0; i < arr.length; i++){
            sum += Math.pow(arr[i] - mean , 2);
        }
        double deviation = Math.sqrt(sum / (arr.length -1));
        System.out.println("The standard deviation is" + " " + deviation);
        return deviation;
    }
}
