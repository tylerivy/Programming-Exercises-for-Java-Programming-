import java.util.*;

public class CheckPassword {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter in a password that is at least 8 digits and has 2 numbers: ");
        String userPassword = sc.nextLine();
        if(isPasswordValid(userPassword)){
            System.out.println("Password is valid.");
        }
        else {
            System.out.println("Password is not valid");
        }

    }

    public static boolean isPasswordValid(String password){
        if(password.length() >= 8 &&
            getPasswordDigits(password) >= 2 &&
                    getSpecialCharacters(password) == 0){
                return true;
        }
        else {
            return false;
        }
    }

    public static int getPasswordDigits(String password){
        int numberOfDigits = 0;
        for(int i = 0; i <= password.length() -1; i++){
            if(Character.isDigit(password.charAt(i))){
                numberOfDigits++;
            }
        }
        return numberOfDigits;
    }

    public static int getSpecialCharacters(String password){
        int specialCharacters = 0;
        for(int i = 0; i <= password.length() -1; i++){
            if(!Character.isLetterOrDigit(password.charAt(i))){
                specialCharacters++;
            }

        }
        return specialCharacters;
    }
}
