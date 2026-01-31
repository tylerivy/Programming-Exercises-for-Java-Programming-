package Chapter7SingleDimensionalArray.src;
import java.util.*;

public class CountOccurence {

    public static void main(String[] args) {
        int [] getNumbers = generateNumbers();
        selectionSort(getNumbers);
        displayNumbers(getNumbers);

    }

    public static int [] generateNumbers(){
        Scanner s = new Scanner(System.in);
        int [] array = new int [5];
        int count = 0;
        while(true){
            System.out.print("Enter a number between 1 - 100, 0 to end: ");
            int number = s.nextInt();
            if(number == 0){
                break;
            }
            if(count == array.length ){
                int [] moreNumbers = new int[array.length * 2];
                for (int i = 0; i < array.length; i++){
                    moreNumbers[i] = array[i];
                }
                array = moreNumbers;
            }
            array[count] = number;
            count++;
        }
        return Arrays.copyOf(array, count);
    }

    public static void printArray(int [] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void selectionSort(int [] array) {
       for (int i = 0; i < array.length -1; i++){
           int minValue = array[i];
           int minIndex = i;
           for(int j = i + 1; j < array.length; j++){
               if(minValue > array[j]){
                   minValue = array[j];
                   minIndex = j;
               }
           }
           if(minIndex != i){
               array[minIndex] = array[i];
               array[i] = minValue;
           }
       }
    }

    public static void displayNumbers(int [] array){
        int count = 1;
        int currentPosition = array[0];
        for(int i = 1; i < array.length; i++){
            if(currentPosition == array[i]){
                count ++;
            }
            else {
                System.out.println(currentPosition + "" + " occurs " + "" + count + (count == 1 ? " time" : " times"));
                count = 1;
                currentPosition = array[i];
            }
        }
    }
}
