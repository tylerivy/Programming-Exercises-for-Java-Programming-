package Chapter7SingleDimensionalArray.src;

public class CountSingleDigit {

    public static void main(String[] args) {
        int [] values = getRandomNumbers();
        int [] counts = getCounts(values);
        printArrayValues(counts);
    }

    public static int [] getRandomNumbers(){
        int [] randomNumbers = new int[100];
        for(int i = 0; i < 100; i++){
            randomNumbers[i] = (int) (Math.random() * 10);
        }
        return randomNumbers;
    }

    public static int [] getCounts(int [] arr){
        int [] counts = new int [10];
        for(int i = 0; i < arr.length; i++){
            switch(arr[i]){
                case 0: counts[0] += 1;
                break;
                case 1: counts[1] += 1;
                break;
                case 2: counts[2] += 1;
                break;
                case 3: counts[3] += 1;
                break;
                case 4: counts[4] += 1;
                break;
                case 5: counts[5] += 1;
                break;
                case 6: counts[6] += 1;
                break;
                case 7: counts[7] += 1;
                break;
                case 8: counts[8] += 1;
                break;
                case 9: counts[9] += 1;
                break;
            }
        }
        return counts;
    }

    public static void printArrayValues(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println("There are" + " " + arr[i] + " " + i + "'s randomly generated");
        }
    }
}
