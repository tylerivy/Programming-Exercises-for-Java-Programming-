import java.util.*;

public class ConvertHoursMinutesSeconds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a long number and get the hours, minutes, and seconds: ");
        long userInput = sc.nextLong();
        System.out.println(convertMillis(userInput));
    }

    public static String convertMillis(long millis){
        String time = "";
        long seconds =(millis / 1000) % 60;
        long minutes = (millis / (1000 * 60)) % 60;
        long hours = (millis / (1000 * 60 * 60));
        time = String.valueOf(hours) + ":" + String.valueOf(minutes) + ":" + String.valueOf(seconds);
        return time;
    }

}
