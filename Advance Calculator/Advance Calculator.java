
/*
->This Calculator throws Arithmetic Exception and also guide the user to enter only
integer value.

->Operates:-
Addition
Subtraction
Multiplication
Division

->It Operates in endless operations.

->All String value will be not accepted during the calculation.
*/


package com.company;

import java.util.Scanner;


class Arithmetic_Exception extends ArithmeticException {
    @Override
    public String toString() {
        return " Number cannot be divide by 0." + getMessage();
    }

    @Override
    public String getMessage() {
        return "Please enter a valid operation";
    }

}

class Cal extends Arithmetic_Exception  {
    Scanner sc = new Scanner(System.in);
    public void menu() {

        System.out.println("Press no. to choose the Arithmetic Operation");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3,Multiply");
        System.out.println("4.Division");

        int user_input;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Choose Operation : ");
            user_input = sc.next().charAt(0);

            switch (user_input) {
                case '1' -> {
                    System.out.println("Enter Number for Addition");
                    add();
                    System.out.println("------------------");
                }
                case '2' -> {
                    System.out.println("Enter Number for Subtraction");
                    sub();
                    System.out.println("------------------");
                }
                case '3' -> {
                    System.out.println("Enter Number for Multiply");
                    Multiply();
                    System.out.println("------------------");
                }
                case '4' -> {
                    System.out.println("Enter Number for Division");
                    divide();
                    System.out.println("------------------");
                }
//                case '5' -> System.out.println("------------------");
                default -> System.out.println("Choose only given Options");
            }

        } while (user_input != 5);
        System.out.println("Thanks for using Calculator");

    }
    public void add() {
        System.out.println("Enter the digit for Addition.");
        System.out.print("Enter First digit :  ");

        while (!sc.hasNextDouble()) {
            System.out.print("Invalid input! Enter First digit :");
            sc.next();
        }
        System.out.print("Enter Second digit :  ");
        double input_1 = sc.nextDouble();

        while (!sc.hasNextDouble()) {
            System.out.print("Invalid input! Enter Second digit :");
            sc.next();
        }
        double input_2 = sc.nextDouble();

        double result = input_1 + input_2;
        System.out.println("The result is :" + result);

    }

    public void sub() {
        System.out.println("Enter the digit for Subtraction.");
        System.out.print("Enter First digit :  ");
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid input! Enter First digit :");
            sc.next();
        }
        System.out.print("Enter Second digit :  ");
        double input_1 = sc.nextDouble();

        while (!sc.hasNextDouble()) {
            System.out.print("Invalid input! Enter Second digit :");
            sc.next();
        }
        double input_2 = sc.nextDouble();

        double result = input_1 - input_2;
        System.out.println("The result is :" + result);
    }

    public void Multiply() {
        System.out.println("Enter the digit for Multiplication.");
        System.out.print("Enter First digit :  ");
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid input! Enter First digit :");
            sc.next();
        }
        System.out.print("Enter Second digit :  ");
        double input_1 = sc.nextDouble();

        while (!sc.hasNextDouble()) {
            System.out.print("Invalid input! Enter Second digit :");
            sc.next();
        }
        double input_2 = sc.nextDouble();

        double result = input_1 * input_2;
        System.out.println("The result is :" + result);
    }

    public void divide() {
        System.out.println("Enter the digit for Division.");
        System.out.print("Enter First digit :  ");
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid input! Enter First digit :");
            sc.next();
        }
        System.out.print("Enter Second digit :  ");
        double input_1 = sc.nextDouble();
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid input! Enter Second digit :");
            sc.next();
        }
        double input_2 = sc.nextDouble();

        if (input_2 == 0) {
            System.out.println("Cannot divide by 0.");
        }
        double result = input_1 / input_2;
        System.out.println("The Result is :" + result);
    }
}
public class Advance_calculator {
    public static void main(String[] args) throws Arithmetic_Exception {

        Cal cc = new Cal();
        cc.menu();
    }
}
