package Chapter7SingleDimensionalArray.src;

import java.util.*;

public class IndexOfSmallestElement {

    public static void main(String[] args) {
        double [] doubleValues = getDoubleValues();
        System.out.printf("The index of the minimal value is" + " " + indexOfSmallestElement(doubleValues));

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

    public static int indexOfSmallestElement(double [] arr){
        int lowestIndex = 0;
        double lowestValue = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(lowestValue > arr[i]){
                lowestIndex = i;
                lowestValue = arr[i];

            }
        }
        return lowestIndex;
    }
}
