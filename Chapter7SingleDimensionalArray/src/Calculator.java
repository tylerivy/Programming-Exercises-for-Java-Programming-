package Chapter7SingleDimensionalArray.src;

public class Calculator {

    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("You must input operator1 operand operator2");
            System.exit(1);
        }

        int result = 0;

        switch(args[1]){
            case "+":
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case "-":
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case "*":
                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case "/":
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                break;
        }
        System.out.println(args[0] + " " + args[1] + " " + args[2] + " " + " = " + result);
    }
}
