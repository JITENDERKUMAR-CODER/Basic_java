package ATM_System;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends account {

    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<>();


    // Login Menu
    public void getLogin() {

        // Default accounts
        data.put(952141, 191904);
        data.put(989947, 71976);

        while (true) {

            System.out.println("\nWelcome to ATM Project");
            System.out.println("1 - Login");
            System.out.println("2 - Create New Account");
            System.out.println("3 - Exit");
            System.out.print("Choice: ");

            int choice = menuInput.nextInt();

            switch (choice) {

                case 1:
                    loginUser();
                    break;

                case 2:
                    createAccount(); // FIXED: now method exists
                    break;

                case 3:
                    System.out.println("Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }


    // CREATE NEW ACCOUNT METHOD (THIS WAS MISSING)
    public void createAccount() {

        System.out.print("Enter New Customer Number: ");
        int customerNumber = menuInput.nextInt();

        if (data.containsKey(customerNumber)) {
            System.out.println("Customer Number already exists.");
            return;
        }

        System.out.print("Enter New PIN: ");
        int pinNumber = menuInput.nextInt();

        data.put(customerNumber, pinNumber);

        System.out.println("Account Created Successfully!");
    }


    // Login Method
    public void loginUser() {

        System.out.print("Enter Customer Number: ");
        int customerNumber = menuInput.nextInt();

        System.out.print("Enter PIN: ");
        int pinNumber = menuInput.nextInt();

        if (data.containsKey(customerNumber)
                && data.get(customerNumber) == pinNumber) {

            System.out.println("Login Successful!");
            getAccountType();

        } else {
            System.out.println("Wrong Customer Number or PIN.");
        }
    }


    // Account Type Menu
    public void getAccountType() {

        while (true) {

            System.out.println("\nSelect Account Type:");
            System.out.println("1 - Checking Account");
            System.out.println("2 - Saving Account");
            System.out.println("3 - Exit");
            System.out.print("Choice: ");

            int selection = menuInput.nextInt();

            switch (selection) {

                case 1:
                    getChecking();
                    break;

                case 2:
                    getSaving();
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }


    // Checking Menu
    public void getChecking() {

        while (true) {

            System.out.println("\nChecking Account:");
            System.out.println("1 - View Balance");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Deposit");
            System.out.println("4 - Back");

            int selection = menuInput.nextInt();

            switch (selection) {

                case 1:
                    System.out.println("Balance: "
                            + moneyFormat.format(getCheckingBalance()));
                    break;

                case 2:
                    getCheckingWithdrawInput();
                    break;

                case 3:
                    getCheckingDepositInput();
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }


    // Saving Menu
    public void getSaving() {

        while (true) {

            System.out.println("\nSaving Account:");
            System.out.println("1 - View Balance");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Deposit");
            System.out.println("4 - Back");

            int selection = menuInput.nextInt();

            switch (selection) {

                case 1:
                    System.out.println("Balance: "
                            + moneyFormat.format(getSavingBalance()));
                    break;

                case 2:
                    getSavingWithdrawInput();
                    break;

                case 3:
                    getSavingDepositInput();
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
