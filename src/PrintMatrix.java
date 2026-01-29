import java.util.*;

public class PrintMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        printMatrix(sc.nextInt());
    }

    public static void printMatrix(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                System.out.print((int) (Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }
}
