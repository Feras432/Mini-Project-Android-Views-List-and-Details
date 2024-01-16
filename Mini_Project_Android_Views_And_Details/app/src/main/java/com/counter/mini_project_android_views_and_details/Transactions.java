package com.counter.mini_project_android_views_and_details;

public class Transactions {
    private int id, account;
    public String date, string;
    public double amount, balance;

    public Transactions(int id, int account, String date, String string, double amount, double balance) {
        this.id = id;
        this.account = account;
        this.date = date;
        this.string = string;
        this.amount = amount;
        this.balance = balance;
    }

    public enum type {
        OPTION_ONE("Withdraw"), OPTION_TWO("Deposit");

        private final String stringValue;

        type(String stringValue) {
            this.stringValue = stringValue;

        }


        public String getStringValue() {
            return stringValue;
        }

    }

    public int getId() {
        return id;
    }

    public int getAccount() {
        return account;
    }

    public static String getDate() {
        return date;
    }

    public String getString() {
        return string;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }
}
