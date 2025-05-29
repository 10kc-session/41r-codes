package com.test;

public class BankAccount {
    private double balance = 0;

    public synchronized void deposit(double amount) {
        System.out.println(Thread.currentThread().getName() + " is depositing " + amount);
        balance += amount;
        System.out.println("Current balance after deposit: " + balance);
        notifyAll();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void withdraw(double amount) {
        System.out.println(Thread.currentThread().getName() + " is trying to withdraw " + amount);
        while (balance < amount) {
            System.out.println("Insufficient balance. " + Thread.currentThread().getName() + " waiting for deposit...");
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " withdrew " + amount);
        System.out.println("Current balance after withdrawal: " + balance);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread depositor = new Thread(() -> {
            account.deposit(2000);
        }, "Depositor");

        Thread withdrawer1 = new Thread(() -> {
            account.withdraw(200);
            account.withdraw(100);
        }, "Withdrawer-1");
        
        
        Thread withdrawer2 = new Thread(() -> {
            account.withdraw(1000);
        }, "Withdrawer-2");


        withdrawer1.start();
        withdrawer2.start();
        depositor.start();

        try {
            depositor.join();
            withdrawer1.join();
            withdrawer2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.balance);
    }
}