package Chapter7SingleDimensionalArray.src;

import java.util.*;
public class ReverseNumbers {

    public static void main(String[] args) {
        int [] numbers = new int [10];
        getNumbers(numbers);
        System.out.println("The numbers that you entered... ");
        printArray(numbers);
        System.out.println("Those numbers reversed... ");
        int [] reverse = reverseNumbers(numbers);
        printArray(reverse);


    }

    public static void getNumbers(int [] array){
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter in a number: ");
            array[i] = s.nextInt();
            System.out.println();
        }
    }

    public static void printArray(int [] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int [] reverseNumbers(int [] array){
        int [] reverse = new int [array.length];
        for(int i = array.length -1, j = 0; i >= 0; i--, j++){
            reverse[j] = array[i];
        }
        return reverse;
    }
}
