package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount p1 = new BankAccount();
        p1.setAccountNumber(1);
        p1.setOwner("Oscar");
        p1.openAccount("Current account");
        p1.currentStatus();


    }


}
