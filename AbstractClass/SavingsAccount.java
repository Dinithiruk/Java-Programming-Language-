package AbstractClass;

public class SavingsAccount extends Account{
    //constructor 
    public SavingsAccount(String accNo, String name, double balnce){
        this.accNo=accNo;
        this.name=name;
        this.balance=balnce;
    }

    //Implementation for abstract withdraw method
    @Override
    public void withdraw(double amount){
        if(amount<balance){
            balance-=amount;
        }else{
            System.out.println("Error: Insuffient balance in the account");
        }
    }
}
