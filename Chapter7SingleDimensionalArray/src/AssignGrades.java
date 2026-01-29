package Chapter7SingleDimensionalArray.src;

import java.util.*;
public class AssignGrades {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the total number of students: ");
        int userOption = s.nextInt();
        double [] grades = new double [userOption];
        getGradesFromUser(grades);
        displayGrades(grades);


    }

    public static void getGradesFromUser(double [] array){
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter a grade: ");
            array[i] = s.nextDouble();
            System.out.println();
        }
    }

    public static void displayGrades(double [] array){
        for(int i = 0; i < array.length; i++){
            int range = (int) array[i] / 10;
            switch (range){
                case 10: System.out.println(array[i] + " -  " + "is an perfect score!");
                break;
                case 9: System.out.println(array[i] + " - " + "A");
                break;
                case 8: System.out.println(array[i] + " - " + "B");
                break;
                case 7: System.out.println(array[i] + " - " + "C");
                break;
                case 6: System.out.println(array[i] + " - " + "D");
                break;
                case 5: System.out.println(array[i] + " - " + "F");
                break;
                case 4: System.out.println(array[i] + " - " + "F");
                break;
                case 3: System.out.println(array[i] + " - " + "F");
                break;
                case 2: System.out.println(array[i] + " - " + "F");
                break;
                case 1: System.out.println(array[i] + " - " + "F");
                break;
                case 0: System.out.println(array[i] + " - " + "F");
                break;
            }
        }
    }
}
