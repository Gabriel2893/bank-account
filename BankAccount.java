package org.example;

public class BankAccount {
    //Attributes
    public int accountNumber;
    protected String type;
    private String owner;
    private float balance;
    private boolean status;
    //Current status method
    public void currentStatus(){
        System.out.println("---------------------------------------------------------");
        System.out.println("Account Number: " + this.getAccountNumber());
        System.out.println("Owner: " + this.getOwner());
        System.out.println("current balance: R$:" + this.getBalance());
        System.out.println("Account type: " + this.getType());
        System.out.println("---------------------------------------------------------");
    }
    //System methods

    public void openAccount(String type) {
        this.setType(type);
        this.setStatus(true);
        if (type == "Current account") {
            this.setBalance(50);
        } else if (type == "Savings account") {
            this.setBalance(150);
        }
        System.out.println("Account opened successfully");
    }
    public void closeAccount() {
        if (this.getBalance() > 0) {
            System.out.println("Account can't be closed because it still has money in it");
        } else if (this.getBalance() < 0) {
            System.out.println("The account is in debt, pay off your debts to close it.");
        } else {
            this.setStatus(false);
            System.out.println("account successfully closed");
        }
    }
    public void deposit(float money) {
        if (this.getStatus()){
            this.setBalance(this.getBalance()+ money);
            System.out.println("Deposit made to" + this.getOwner() + "'s account");}
        else {
            System.out.println("it is not possible to deposit into a closed or non-existent account");
        }
    }

    public void draw(float money) {
        if (this.getStatus()){
            if (this.getBalance() >= money){
                this.setBalance(this.getBalance() - money);
                System.out.println("successful withdrawal from" + this.getOwner() + "'s account");
            }else{
                System.out.println("insufficient balance to withdraw");
            }
        }
        else {
            System.out.println("it is not possible to withdraw from a closed account");
        }
    }

    public void payMonthlyFee() {
        int money = 0;
        if (this.getType() == "Current account"){
            money = 12;
        } else if (this.getType() == "savings account") {
            money = 20;
        }
        if (this.getStatus()){
            this.setBalance(this.getBalance() - money);
            System.out.println("monthly fee paid");
        }
    }
    //Método construtor
    public BankAccount() {

    }

    //Getters and setters methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
