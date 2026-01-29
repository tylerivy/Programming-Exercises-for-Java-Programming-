public class SumSeries {

    public static void main(String[] args) {
        double sum = 0.0;
        for(int i = 1; i <= 20; i++){
            sum += sumSeries(i);
            System.out.printf("%d\t %.4f", i, sum);
            System.out.println();
        }
    }

    public static double sumSeries(double num){
        return num / (num + 1);
    }
}
