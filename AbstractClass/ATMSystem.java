package AbstractClass;

public class ATMSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("784511", "Micheal witson", 3000.00);
        KidsAccount kidsAccount = new KidsAccount("12121", "Tommy Wilson", 1000.00);

        savingsAccount.display();
        savingsAccount.withdraw(500.00);
        savingsAccount.display();

        kidsAccount.display();
        kidsAccount.withdraw(250.00);
        kidsAccount.display();
    }
}
