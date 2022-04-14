package Project1;

import java.util.Scanner;



public class BankAccountTester {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello Welcome! Please Enter your Name:");
        BankAccount gregChecking = new BankAccount(20000);
        String name = keyboard.nextLine();
        System.out.println("Welcome " + name + ", How much would you like start your account with?");
        double startAmount = keyboard.nextDouble();
        BankAccount name_checking = new BankAccount(startAmount);
        if (startAmount >= 10000){
            System.out.println("This amount equals or exceeds $10,000. Would you like to create a savings account? \n1: yes \n2: no");
            int savingSelection = keyboard.nextInt();
            if (savingSelection == 1){
                System.out.println("Which would you like to create? \n1: Simple Interest Plan \n2: Compound Interest Plan");
                int interestSelect = keyboard.nextInt();
                if(interestSelect == 1){
                    System.out.println("Please enter the amount of years");
                    int years = keyboard.nextInt();
                    name_checking.savingsAccountSimple(name_checking, years);
                }else if(interestSelect == 2){
                    System.out.println("Please enter the amount of years");
                    int years = keyboard.nextInt();
                    name_checking.savingsAccountCompound(name_checking, years);
                }else{
                    System.out.println("Error: no valid selection");
                }
            }
        }else if (startAmount < 10000){
        System.out.println("Great! "+ name+" Your starting balance is: $"+ name_checking.getBalance());
        int menuSelection = BankAccount.menu();
        System.out.println(menuSelection);
        
        if(menuSelection == 1){
            System.out.println("Getting Account Balance...");
            System.out.println("Total Balance: $"+name_checking.getBalance());

        }else if (menuSelection == 2){
            System.out.println("Please enter the amount to deposit");
            double depositAmount = keyboard.nextDouble();
            name_checking.deposit(depositAmount);
            System.out.println("Amount: $"+depositAmount + " Was Deposited");
            System.out.println("Total Balance: $" + name_checking.getBalance());

        }else if (menuSelection == 3){
            System.out.println("Please enter the amount to withdraw");
            double withdrawAmount = keyboard.nextDouble();
            
            if (withdrawAmount > name_checking.getBalance()){
                System.out.println("Warning: The amount you are about to withdraw exceeds the total balance. If this amount is withdrawn, a $35 fee will be incurred. Would you like to withdraw anyway? \n1: yes \n2: no");
                int overdraftSelection = keyboard.nextInt();
                if (overdraftSelection == 1){
                    name_checking.overDraft(withdrawAmount);
                    System.out.println("Amount: $" + withdrawAmount + " was withdrawn with a $35 fee");
                    System.out.println("Total Balance: $" + name_checking.getBalance());
                }
                else if (overdraftSelection == 2){
                    System.out.println("Amount: $0 was withdrawn");
                    System.out.println("Total Balance: $" + name_checking.getBalance());
                    System.exit(0);
                }
                else{
                    System.out.println("Error: No Valid Selection");
                }
            }
            else if (withdrawAmount <= name_checking.getBalance()){
                name_checking.withdraw(withdrawAmount);
                System.out.println("Amount: $" + withdrawAmount + " Was Withdrawn");
                System.out.println("Total Balance: $" + name_checking.getBalance());
            }
        }else if(menuSelection == 4){
            System.out.println("Which would you like to create? \n1: Simple Interest Plan \n2: Compound Interest Plan");
            int interestSelect = keyboard.nextInt();
            if(interestSelect == 1){
                System.out.println("Please enter the amount of years");
                int years = keyboard.nextInt();
                name_checking.savingsAccountSimple(name_checking, years);
                System.exit(0);
            }else if(interestSelect == 2){
                System.out.println("Please enter the amount of years");
                int years = keyboard.nextInt();
                name_checking.savingsAccountCompound(name_checking, years);
                System.exit(0);
            }else{
                System.out.println("Error: no valid selection");
            }
        }else if(menuSelection == 5){

            System.out.println("Please enter the amount of years");
            int years = keyboard.nextInt();
            name_checking.calcInterest(name_checking.getBalance(), years, 0.15, 12);
        
        }else if(menuSelection == 6){
            System.out.println("Please enter the amount of years");
            int years = keyboard.nextInt();
            name_checking.calcSimpleInterest(name_checking.getBalance(), years, 0.15);

        }else if(menuSelection == 7){
            System.out.println("Please enter the amount you would like to transfer");
            double transferAmount = keyboard.nextDouble();
            name_checking.transfer(name_checking, gregChecking, transferAmount);
            System.out.println("Amount: $" + transferAmount + " was transferred");
            System.out.println(name + "'s Total Balance: $" + name_checking.getBalance());
            System.out.println("Greg's Total Balance: $" + gregChecking.getBalance());

        }else if (menuSelection == 0){
            System.out.println("Have a nice day!");
        }else{
            System.out.println("Error: No Valid Selection");
        }
        keyboard.close();
    }
    }
}
