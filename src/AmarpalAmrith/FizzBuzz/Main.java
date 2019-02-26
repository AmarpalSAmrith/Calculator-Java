package AmarpalAmrith.FizzBuzz;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator!");

        Random Rn = new Random();
        Scanner Input = new Scanner(System.in);
        System.out.println("Please enter the first Number:");
        int No1 = Input.nextInt();
        System.out.println("Please enter the second Number:");
        int No2 = Input.nextInt();
        System.out.println("Please enter the operator ( *, +, -, /):");
        String symbol = Input.next();
        System.out.println("Number 1 is: " + No1);

        System.out.println("Number 2 is: " + No2);
        String operator = "";
        switch (symbol) {
            case "+":
                operator = "Add";
                break;
            case "-":
                operator = "Subtract";
                break;
            case "*":
                operator = "Multiple";
                break;
            case "/":
                operator = "Divide";
                break;
        }
        System.out.println("Calculation is: " + No1 + " " + operator + " " + No2);
        TheCalculator Calculate;
        if (symbol.equals("*")) {
            Calculate = new Multiply();
        } else if (symbol.equals("-")) {
            Calculate = new Subtract();
        } else if (symbol.equals("+")) {
            Calculate = new Add();
        } else if (symbol.equals("/")) {
            Calculate = new Divide();
        } else {
            System.exit(1);
            return;
        }

        System.out.println(Calculate.calculator(No1, No2));
    }
}
