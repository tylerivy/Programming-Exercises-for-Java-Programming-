public class PrintATaxTable {

    public static void main(String[] args) {
        double taxableIncome = 50000.00;
        System.out.println("Taxable Income\tSingle\t    Married Joint or Qualifying Widow(er)\tMarried Separate\tHead of House hold");

        while(taxableIncome <= 60000.0){
            System.out.printf("$%.2f\t\t$%.2f\t\t$%.2f\t\t\t\t\t\t\t$%.2f\t\t\t$%.2f", taxableIncome, getSingleTax(taxableIncome), getMarriedFilingJointlyTax(taxableIncome), getMarriedFilingSeparately(taxableIncome) , getHeadOfHouseHold(taxableIncome));
            taxableIncome += 50.0;
            System.out.println();
        }
    }

    public static double getSingleTax(double taxableIncome){
        double federalTax = 0.0;
        if(taxableIncome <= 8350){
            federalTax = taxableIncome * .1;
            return federalTax;
        }
        else if(taxableIncome <= 33950){
            federalTax = ((taxableIncome - 8351) * .15) + (8351 * .1);
            return federalTax;
        }
        else if(taxableIncome <= 82250){
            federalTax = ((taxableIncome - 33951) * .25) + ((33950 - 8351) * .15) + 8350 * .1;
            return federalTax;
        }
        else if(taxableIncome <= 171550){
            federalTax = ((taxableIncome - 82251) * .28) + ((82250 - 33951) * .25) + ((33950 - 8351) * .15) + 8350 * .1;
            return federalTax;
        }
        else if(taxableIncome <= 372950){
            federalTax = ((taxableIncome - 171551) * .33) + ((171550 - 82251) * .28) + ((82250 - 33951) * .25) + ((33950 - 8351) * .15) + 8350 * .1;
            return federalTax;
        }
        else {
            federalTax = ((taxableIncome - 372951) * .35) + ((372950 - 171551) * .33) + ((171550 - 82251) * .28) + ((82250 - 33951) * .25) + ((33950 - 8351) * .15) + 8350 * .1;
            return federalTax;
        }
    }

    public static double getMarriedFilingJointlyTax(double taxableIncome){
        double federalTax = 0.0;
        if(taxableIncome <= 16700){
            federalTax = taxableIncome * .1;
            return federalTax;
        }
        else if(taxableIncome <= 67900){
            federalTax = ((taxableIncome - 16701) * .15) + 16700 * .1;
            return federalTax;
        }
        else if(taxableIncome <= 137050){
            federalTax = ((taxableIncome - 67901) * .25) + ((67900 - 16701) * .15) + (16700 * .1);
            return federalTax;
        }
        else if(taxableIncome <= 208850){
            federalTax = ((taxableIncome - 137051) * .28) + ((137050 - 67901) * .25) + ((67900 - 16701) * .15) + (16700 * .1);
            return federalTax;
        }
        else if(taxableIncome <= 372950){
            federalTax = ((taxableIncome - 208851) * .33) + ((208850 - 137051) * .28) + ((137050 - 67901) * .25) + ((67900 - 16701) * .15) + (16700 * .1);
            return federalTax;
        }
        else {
            federalTax = ((taxableIncome - 372951) * .35) + ((372950 - 208851) * .33) + ((208850 - 137051) * .28) + ((137050 - 67901) * .25) + ((67900 - 16701) * .15) + (16700 * .1);
            return federalTax;
        }
    }

    public static double getMarriedFilingSeparately(double taxableIncome){
        double federalTax = 0.0;
        if(taxableIncome <= 8350){
            federalTax = taxableIncome * .1;
            return federalTax;
        }
        else if(taxableIncome <= 33950){
            federalTax = ((taxableIncome - 8351) * .15) + (8350 * .1);
            return federalTax;
        }
        else if(taxableIncome <= 68525){
            federalTax = ((taxableIncome - 33951) * .25) + ((33950 - 8351) * .15) + (8350 * .1);
            return federalTax;
        }
        else if(taxableIncome <= 104425){
            federalTax = ((taxableIncome - 68526) * .28) + ((68525 - 33951) * .25) + ((33950 - 8351) * .15) + (8350 * .1);
            return federalTax;
        }
        else if(taxableIncome <= 186475){
            federalTax = ((taxableIncome - 104426) * .33) + ((104426 - 68526) * .28) + ((68525 - 33951) * .25) + ((33950 - 8351) * .15) + (8350 * .1);
            return federalTax;
        }
        else {
            federalTax = ((taxableIncome - 186476) * .35) + ((186475 - 104426) * .33) + ((104425 - 68526) * .28) + ((68525 - 33951) * .25) + ((33950 - 8351) * .15) + (8350 * .1);
            return federalTax;

            }
        }

    public static double getHeadOfHouseHold(double taxableIncome){
        double federalTax = 0.0;
        if(taxableIncome <= 11950){
            federalTax = taxableIncome * .1;
            return federalTax;
        }
        else if(taxableIncome <= 45500){
            federalTax = ((taxableIncome - 11951) * .15) + (11950 * .1);
            return federalTax;
        }
        else if(taxableIncome <= 117450){
            federalTax = ((taxableIncome - 45501) * .25) + ((45500 - 11951) * .15) + (11950 * .1);
            return federalTax;
        }
        else if(taxableIncome <= 190200){
            federalTax = ((taxableIncome - 117451) * .28) + ((117450 - 45501) * .25) + ((45500 - 11951) * .15) + (11950 * .1);
            return federalTax;
        }
        else if(taxableIncome <= 372950){
            federalTax = ((taxableIncome - 190201) * .33) + ((190200 - 117451) * .28) + ((117450 - 45501) * .25) + ((4500 - 11951) * .15) + (11950 * .1);
            return federalTax;
        }
        else {
            federalTax = ((taxableIncome - 372951) * .35) + ((372950 - 190201) * .33) + ((19200 - 117451) * .28) + ((117450 - 45501) * .25) + ((45500 - 11951) * .15) + (11950 * .1);
            return federalTax;
        }
    }
}

