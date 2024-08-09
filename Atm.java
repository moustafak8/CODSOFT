
package com.mk7.atm;

import java.util.Scanner;


public class Atm {
      private BankAccount userAccount;

    public Atm(double initialBalance) {
        userAccount = new BankAccount(initialBalance);
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("0. Exit");
    }

    public void processUserChoice(int choice) {
        Scanner scanner = new Scanner(System.in);

        switch (choice) {
            case 1:
                System.out.print("Enter withdrawal amount: ");
                double withdrawAmount = scanner.nextDouble();
                if (userAccount.withdraw(withdrawAmount)) {
                    System.out.println("Withdrawal successful.");
                }
                break;
            case 2:
                System.out.print("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                userAccount.deposit(depositAmount);
                System.out.println("Deposit successful.");
                break;
            case 3:
                System.out.println("Current balance: $" + userAccount.getBalance());
                break;
            case 0:
                System.out.println("Thank you for using the ATM. Have a great day!");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
    }

    public static void main(String[] args) {
         Atm atm = new Atm(1000.0); // Initial account balance
        Scanner scanner = new Scanner(System.in);

        while (true) {
            atm.displayMenu();
            System.out.print("Enter your choice (0-3): ");
            int choice = scanner.nextInt();
            if (choice == 0) {
                break; // Exit the ATM
            }
            atm.processUserChoice(choice);
        }
    }
    }

