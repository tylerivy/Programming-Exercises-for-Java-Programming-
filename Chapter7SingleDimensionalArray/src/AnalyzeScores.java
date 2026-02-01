package Chapter7SingleDimensionalArray.src;
import java.util.*;

public class AnalyzeScores {

    public static void main(String[] args) {
        double [] numbers = getNumbers();
        double average = aboveAverage(numbers);
        belowAverage(numbers, average);
    }

    public static double [] getNumbers(){
        Scanner s = new Scanner(System.in);
        double [] values = new double [5];
        int count = 0;
        while(true){
            System.out.print("Enter a double score value, or a negative number to end: ");
            double userInput = s.nextDouble();
            if(userInput < 0){
                break;
            }
            if(count == values.length -1){
                double [] moreValues = new double [values.length * 2];
                for(int i = 0; i < values.length; i++){
                    moreValues[i] = values[i];
                }
                values = moreValues;
            }
            values[count] = userInput;
            count++;
        }
        System.out.println("Count is " + " " + count);
        return Arrays.copyOf(values, count);
        }

        public static void printArray(double [] arr){
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }

    public static double aboveAverage(double [] arr){
        double sum = 0.0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double average = sum / arr.length;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= average){
                count++;
            }
        }
        System.out.println("The average is " + "" + average);
        System.out.println("The number of scores above or equal to the average is " + "" + count);
        return average;
    }

    public static void belowAverage(double [] arr, double num){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(num > arr[i]){
                count++;
            }
        }
        System.out.println("Number of scores below the average is" + " " + count);
    }

    }

