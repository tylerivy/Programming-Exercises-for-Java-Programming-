import java.util.*;

public class OccurrencesOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();
        System.out.print("Enter a character: ");
        char userChar = sc.next().charAt(0);

        System.out.println("There are " + count(userInput, userChar) + " occurrences of " + userChar + " in " + userInput);
    }

    public static int count(String s, char c){
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                sum++;
            }
        }
        return sum;
    }
}
