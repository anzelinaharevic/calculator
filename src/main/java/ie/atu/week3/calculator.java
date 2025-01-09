package ie.atu.week3;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first numbers: ");
        double firstNum = scan.nextDouble();

        System.out.println("Please enter second numbers: ");
        double secondNum = scan.nextDouble();

        scan.nextLine();


        System.out.println("Please choose operation: (+, -, * , /): ");
        String operation = scan.nextLine();

        boolean validOperation = true;
        double result = switch(operation){
            case "+" -> {yield firstNum + secondNum;}

            case "-" -> firstNum - secondNum;

            case "*" -> firstNum * secondNum;

            case "/" -> firstNum / secondNum;

            default -> {
                System.out.println("Invalid operation");
                validOperation = false;
                yield 0;
            }
        };

        if (validOperation = true) {
            System.out.println("The result is: " + result);
        }

    }

}