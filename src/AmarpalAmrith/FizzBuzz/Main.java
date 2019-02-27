package AmarpalAmrith.FizzBuzz;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator!");

        Scanner Input = new Scanner(System.in);
        List <Integer> myList = new ArrayList<>();
        for (int i1 = 1; ; i1++){
            System.out.println("Please enter Number " + i1);
            if (Input.hasNextInt()) {
                myList.add(Input.nextInt());
            } else {
                System.out.println(Input.next() + " is not a number");
                break;
            }
        }

        System.out.println("Please enter the operator ( *, +, -, /):");
        String symbol = Input.next();

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
        int result = myList.get(0);
        for (int i = 1; i <= myList.size() - 1; i++){
            result = Calculate.calculator(result, myList.get(i));
        }
        System.out.println("Answer is: " + result);
    }
}
