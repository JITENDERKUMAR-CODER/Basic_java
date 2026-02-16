package ATM_System;

import java.text.DecimalFormat;
import java.util.Scanner;

public class account {

    // User details
    private int customerNumber;
    private int pinNumber;

    // Account balances
    private double checkingBalance = 0.0;
    private double savingBalance = 0.0;

    // Scanner for input
    Scanner input = new Scanner(System.in);

    // Format money
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");


    // ==============================
    // Customer Number Methods
    // ==============================

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }


    // ==============================
    // PIN Methods
    // ==============================

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }


    // ==============================
    // Get Balance Methods
    // ==============================

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }


    // ==============================
    // Withdraw Methods
    // ==============================

    public double calcCheckingWithdraw(double amount) {
        checkingBalance -= amount;
        return checkingBalance;
    }

    public double calcSavingWithdraw(double amount) {
        savingBalance -= amount;
        return savingBalance;
    }


    // ==============================
    // Deposit Methods
    // ==============================

    public double calcCheckingDeposit(double amount) {
        checkingBalance += amount;
        return checkingBalance;
    }

    public double calcSavingDeposit(double amount) {
        savingBalance += amount;
        return savingBalance;
    }


    // ==============================
    // Withdraw Checking
    // ==============================

    public void getCheckingWithdrawInput() {

        System.out.println("Checking Balance: "
                + moneyFormat.format(checkingBalance));

        System.out.print("Enter amount to withdraw: ");

        double amount = input.nextDouble();

        if (checkingBalance >= amount) {

            calcCheckingWithdraw(amount);

            System.out.println("New Balance: "
                    + moneyFormat.format(checkingBalance));

        } else {
            System.out.println("Insufficient Balance.");
        }
    }


    // ==============================
    // Withdraw Saving
    // ==============================

    public void getSavingWithdrawInput() {

        System.out.println("Saving Balance: "
                + moneyFormat.format(savingBalance));

        System.out.print("Enter amount to withdraw: ");

        double amount = input.nextDouble();

        if (savingBalance >= amount) {

            calcSavingWithdraw(amount);

            System.out.println("New Balance: "
                    + moneyFormat.format(savingBalance));

        } else {
            System.out.println("Insufficient Balance.");
        }
    }


    // ==============================
    // Deposit Checking
    // ==============================

    public void getCheckingDepositInput() {

        System.out.print("Enter amount to deposit: ");

        double amount = input.nextDouble();

        calcCheckingDeposit(amount);

        System.out.println("New Balance: "
                + moneyFormat.format(checkingBalance));
    }


    // ==============================
    // Deposit Saving
    // ==============================

    public void getSavingDepositInput() {

        System.out.print("Enter amount to deposit: ");

        double amount = input.nextDouble();

        calcSavingDeposit(amount);

        System.out.println("New Balance: "
                + moneyFormat.format(savingBalance));
    }

}
