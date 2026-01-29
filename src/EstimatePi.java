public class EstimatePi {

    public static void main(String[] args) {

        for(int i = 1; i <= 901; i+= 100){
            System.out.printf("%d %10.4f", i , getPi(i));
            System.out.println();
        }
    }

    public static double getPi(double num){
        double sum = 0.0;
        for(int i = 1; i <= num; i++){
            sum += 4 * (Math.pow(-1, i + 1) / ((2 * i) - 1));
        }
        return sum;
    }
}
