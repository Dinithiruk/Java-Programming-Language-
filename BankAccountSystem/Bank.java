package BankAccountSystem;

public class Bank {
    static int totalAccounts = 0;   //static variable to count the total no.of accounts 


    public static void createAccount(double initialBalance){
        BankAccount account = new BankAccount(initialBalance);
        totalAccounts++;// This will increamnet for each and every account created 

    }

    public static void displayTotalAccounts(){
        System.out.println("Total Accounts created : "+ totalAccounts);
    }
}
