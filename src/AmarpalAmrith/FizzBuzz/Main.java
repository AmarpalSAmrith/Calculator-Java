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
    System.out.println("Please enter the operator:");
    String symbol = Input.next();
    System.out.println("Number 1 is: " + No1);

	System.out.println("Number 2 is: " + No2);
	String operator = "";
	switch (symbol){
	    case "+" :
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
    if (symbol.equals("*")) {
        System.out.println(No1 * No2);
    } else if (symbol.equals("-")) {
        System.out.println(No1 - No2);
    } else if (symbol.equals("+")) {
        System.out.println(No1 + No2);
    } else if (symbol.equals("/")) {
        System.out.println(No1 / No2);
    }
    }
}
