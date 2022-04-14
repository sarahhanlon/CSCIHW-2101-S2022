package Project1;

import java.util.Scanner;

public class BankAccount {
    private double balance;

    
    public BankAccount(){
        balance = 0;
    }

    public BankAccount(double initalBalance){
        balance = initalBalance;
    }


    public double getBalance(){
        return balance;
    }

 //test
    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }

 //overdraft method
    public void overDraft(double value){
        balance = (balance - value) - 35;
    }

 //transfer method
    public void transfer(BankAccount bank, BankAccount bank2, double amount){
        bank.withdraw(amount);
        bank2.deposit(amount);
    }   
//savings account
    public void savingsAccountSimple(BankAccount bank, int years){
        bank.calcSimpleInterest(bank.getBalance(), years, 0.001);
    }

    public void savingsAccountCompound(BankAccount bank, int years){
        bank.calcInterest(bank.getBalance(), years, 0.001, 4);
    }

    public void monthlyfee(){
        withdraw(10);
    }

    // P(1+ R/n)^(nt) - P 
    // P = principal
    // t = years
    // R = annual interest rate
    // n = # of times its compunded
    // PEMDAS 
    public void calcInterest(double p, int t, double r, int n){
        double amount =  p * Math.pow(1 + (r/n), n*t);
        double compinterest = amount - p;
        System.out.println("Compound Interest after "+ t + " years: "+ compinterest);
        System.out.println("Amount after "+ t +" years: "+ amount);
    }

 //simple interest method
    public void calcSimpleInterest(double p, int t, double r){
        double amount = (p * r * t)/100;
        double simpinterest = amount + p;
        System.out.println("Simple Interest after " + t + " years: " + amount);
        System.out.println("Amount after " + t + " years: " + simpinterest);
    }

    public static int menu(){
        int selection;
        Scanner input = new Scanner(System.in);

        /************************ */
        System.out.println("Please select an option:");
        System.out.println("-------------------------");
        System.out.println("1: Get Balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("4: Create a Savings Account");
        System.out.println("5: Compound Interest");
        System.out.println("6: Simple Interest");
        System.out.println("7: Transfer");
        System.out.println("0: Quit");
        System.out.println("-------------------------");

        selection = input.nextInt();
       

        return selection;

    }





}
