package com.fourpillers.encapsulation;

public class BankAccount {
    //Encapsulation
    private long accountNumber = 123456778;
    private  double accountBalance ;

    public void getAccountNumber (){
        System.out.println("account number : " + this.accountNumber);
    }
    public void deposit(double ammount){
        if(ammount <= 0){
            return;
        }else {
            this.accountBalance =ammount;
        }
    }
    public  void withdraw(double ammount){
        if(ammount >= 0 && ammount <= this.accountBalance){
            this.accountBalance =   this.accountBalance - ammount;
            System.out.println("Withdraw Balance is : " + ammount);

        }else {
            System.out.println("Invalid ammount or Insufficient Balance.");
        }
    }
    public double totalBalance(){
        return this.accountBalance;
    }
}
