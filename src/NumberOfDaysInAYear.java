public class NumberOfDaysInAYear {

    public static void main(String[] args) {
        System.out.println("From the year 2000 to 2020 there are " + numberOfDaysInAYear(2020) + " days.");
    }

    public static int numberOfDaysInAYear(int year){
        int sum = 0;
        for(int i = 1; i <= 20; i++){
            sum += 365;
        }
        return sum;
    }
}
