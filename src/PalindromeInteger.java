import java.util.*;
public class PalindromeInteger {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int userSelection = sc.nextInt();
        if(isPalindrome(userSelection)){
            System.out.println(userSelection + " is a palindrome");
        }
        else {
            System.out.println(userSelection + " is not a palindrome");
        }
    }

    public static int reverse (int number){
        int reversed = 0;
        while(number != 0){
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int number){
       return number == reverse(number);
    }
}
