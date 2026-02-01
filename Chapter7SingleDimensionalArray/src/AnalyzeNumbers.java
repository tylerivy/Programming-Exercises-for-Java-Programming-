import java.util.*;



public class AnalyzeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers would you like to enter? ");
        int userInput = sc.nextInt();

        double [] numbers = new double[userInput];

        for(int i = 0; i < userInput; i++){
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        double average = sum / numbers.length;
        int count = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > average){
                count++;
            }
        }
        System.out.printf("\n The number average of the numbers is %.2f. Numbers above the average: %d", average, count );
    }
}
