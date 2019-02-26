package AmarpalAmrith.FizzBuzz;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Random Rn = new Random();
    int randomNumber = Rn.nextInt(100);
    int randomNumber2 = Rn.nextInt(100);
    System.out.println(randomNumber);
	System.out.println(randomNumber2);
    Scanner Input = new Scanner(System.in);
    String symbol = Input.next();
    if (symbol.equals("*")) {
        System.out.println(randomNumber * randomNumber2);
    } else if (symbol.equals("-")) {
        System.out.println(randomNumber - randomNumber2);
    } else if (symbol.equals("+")) {
        System.out.println(randomNumber + randomNumber2);
    }

    }
}
