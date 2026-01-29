import java.util.*;

public class IntegerReversed {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer and get it revered: ");
        int userInput = sc.nextInt();
        System.out.println(userInput + " revered is " + reverse(userInput));
    }

    public static int reverse(int number){
        int reverse = 0;
        while (number != 0){
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }
}
