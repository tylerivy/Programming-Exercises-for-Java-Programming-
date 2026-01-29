import java.util.*;

public class CountLetters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter in a string: ");
        String userSelection = sc.nextLine();
        System.out.println("There are " + countLetters(userSelection) + " letters in your input");
    }

    public static int countLetters(String input){
        int sum = 0;
        for(int i = 0; i < input.length(); i++){
            if(Character.isLetter(input.charAt(i))){
                sum++;
            }
        }
        return sum;
    }
}
