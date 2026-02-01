package Chapter7SingleDimensionalArray.src;

import java.util.*;

public class DistinctIntegers {

    public static void main(String[] args) {
        int[] values = getValues();
        printDistinctNumbers(values);
    }

    public static int[] getValues() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 10 integers with a space in between: ");
        int[] values = new int[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = s.nextInt();
        }
        return values;
    }

    public static void printDistinctNumbers(int[] arr) {
        int distinctIntegers = arr.length;
        int count = 0;
        while(count < arr.length -1) {
            int placeHolder = arr[count];
            for (int i = count + 1; i < arr.length; i++) {
                if (placeHolder == arr[i]) {
                    distinctIntegers--;
                }
            }
            count++;
        }
        System.out.println("The number of distinct integers is " + "" + distinctIntegers);
    }
}
