package BankAccountSystem;

public class BankAccountSystem {
    public static void main(String[] args) {

        //creating bank accounts 
        Bank.createAccount(1000.0);
        Bank.createAccount(3500.0);

        BankAccount account1 = new BankAccount(0.0);// new account for an exisiting customer 
        account1.deposit(200.0 );//modifying balances 

        Bank.displayTotalAccounts();
        account1.displayAccountInfo();
    }
}
