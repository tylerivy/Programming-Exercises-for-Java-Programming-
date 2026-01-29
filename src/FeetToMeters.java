public class FeetToMeters {

    public static void main(String[] args) {
        System.out.println("Feet\tMeters\t|\tMeters\tFeet");
        System.out.println("-------------------------------------");
        double feet = 1.0;
        double meters = 20.0;
        while(feet <= 10 && meters <= 65){
            System.out.printf("%.1f%10.3f\t|%7.1f%10.2f", feet, feetToMeters(feet), meters, metersToFeet(meters));
            feet += 1.0;
            meters += 5.0;
            System.out.println();
        }


    }

    public static double feetToMeters(double feet){
        return 0.305 * feet;
    }

    public static double metersToFeet(double meters){
        return 3.279 * meters;
    }
}
