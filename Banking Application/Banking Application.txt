/*

*This Banking Application features are:
        Check Balance
        Deposit
        Withdraw
        Previous Withdrawal

*It takes Username and userid from user and helps to operate is Application.
*/

package com.company;
import java.util.Scanner;
class Banking_Sys{
     String Customer_name;
     String Customer_Id;
     double balance;
     double prevTransaction;
    public Banking_Sys(String Customer_name, String Customer_Id) {
        this.Customer_name = Customer_name;
        this.Customer_Id = Customer_Id;
    }
    void deposit(double amount) {
        if (amount != 0) {
            balance = balance + amount;
            prevTransaction = amount;
        }
    }
    void withdraw(double amount){
        if (  amount <= balance ){
            balance -= amount;
            prevTransaction =  -amount;
        }
        else {
            System.out.println("Insufficient Balance!");
        }
    }
    void getPreviousTransaction(){
        if (prevTransaction>0){
            System.out.println("Deposited " + prevTransaction);

        }else if (prevTransaction<0){
            System.out.println("Withdrawn " + Math.abs(prevTransaction));
        }
        else {
            System.out.println("No Transaction occurred :");
        }
    }
    void menu() {
        System.out.println("Welcome to our Banking System "+ Customer_name );
        System.out.println("Your Bank Id " + Customer_Id);
        System.out.println("\n");

        System.out.println("1) Check Amount");
        System.out.println("2) Deposit Amount");
        System.out.println("3) Withdraw Amount");
        System.out.println("4) Previous Transaction");
        System.out.println("5) Exit");

        char option;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("-----------------------");
            System.out.print("Choose Option: ");
            option = sc.next().charAt(0);
            System.out.println("------------------------");

            switch (option) {
                case '1' -> {
                    System.out.println("-----------");
                    System.out.println("Balance is : " + balance);
                    System.out.println("............");
                }
                case '2' -> {
                    System.out.println("-------------");
                    System.out.print("Enter the amount to deposit: ");
                    double amount1 = sc.nextDouble();
                    deposit(amount1);
                    System.out.println("Final Balance : " + balance);
                    System.out.println("..............");
                }
                case '3' -> {
                    System.out.println("--------------");
                    System.out.print("Enter the amount to withdraw : ");
                    double balance21 = sc.nextDouble();
                    withdraw(balance21);
                    System.out.println("Final Balance : " + balance);
                    System.out.println("................");
                }
                case '4' -> {
                    System.out.println("---------------");
                    System.out.println("Previous Transaction");
                    getPreviousTransaction();
                    System.out.println("..............");
                }
                case '5' -> System.out.println("*****************");
                default -> System.out.println("Choose the given options!");
            }

        } while (option != '5');
        System.out.println("Thank you for using Our Banking Service.");
    }
}
public class Banking_System {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = sc.next();
        System.out.print("Enter Customer id : ");
        String CustomerId = sc.next();
        Banking_Sys bs = new Banking_Sys(name,CustomerId);
        bs.menu();
    }
}
