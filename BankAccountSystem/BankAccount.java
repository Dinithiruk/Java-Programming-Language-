package BankAccountSystem;

public class BankAccount {
    double balance; //Instance variable to store account balances 

    public BankAccount(double initialBalance){
        balance = initialBalance;
        
    }
    void deposit(double amount){
        balance +=amount;
    }
    void displayAccountInfo(){
        System.out.println("Account Balance : Rs "+ balance);
    }
    
}