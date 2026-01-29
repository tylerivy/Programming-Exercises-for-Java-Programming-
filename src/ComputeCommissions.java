public class ComputeCommissions {

    public static void main(String[] args) {

        int salesAmount = 10000;


        System.out.println("Sales Amount\tCommission");
        for(int i = 1; i < 20; i++){
            System.out.printf("%d\t%.1f", salesAmount, getCommission(salesAmount));
            salesAmount += 5000;
            System.out.println();
        }
    }

    public static double getCommission(double salesAmount){
        double commission = 0.0;
        if(salesAmount <= 5000){
            commission = salesAmount * .08;
            return commission;
        }
        else if(salesAmount <= 10000){
            commission = (5000 * .1) + (5000 * .08);
            return commission;
        }
        else{
            commission = (5000 * .08) + (5000 * .1) + ((salesAmount - 10000) * .12);
            return commission;
        }
    }
}
