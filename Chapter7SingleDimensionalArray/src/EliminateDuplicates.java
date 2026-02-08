package Chapter7SingleDimensionalArray.src;

import java.util.*;

public class EliminateDuplicates {

    public static void main(String[] args) {
        int [] integerValues = getIntegerValues();
        int [] nonDuplicates = eliminateDuplicates(integerValues);
        printArray(nonDuplicates);
    }

    public static int [] getIntegerValues(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter in 10 integers with a space in between: ");
        int [] values = new int [10];
        for(int i = 0; i < values.length; i++){
            values[i] = s.nextInt();
        }
        return values;
    }

    public static int [] eliminateDuplicates(int [] arr){
        int position = 0;
        int [] nonDuplicates = new int [arr.length];
        for(int i = 0; i < arr.length; i++){
            boolean inArray = false;
            for(int j = 0; j < position; j++){
                if(arr[i] == arr[j]){
                    inArray = true;
                    break;
                }
            }
            if(!inArray){
                nonDuplicates[i] = arr[i];
                position++;
            }
        }
        return nonDuplicates;
    }

    public static void printArray(int [] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
