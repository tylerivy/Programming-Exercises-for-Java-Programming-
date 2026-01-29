import java.util.*;

public class DisplayPatterns {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter in a number: ");
        int userInput = sc.nextInt();
        displayPattern(userInput);
    }

    public static void displayPattern(int num){
        for(int i = 1; i <= num; i++){
            for(int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
