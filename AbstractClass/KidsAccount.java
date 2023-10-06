package AbstractClass;

public class KidsAccount extends Account {
    //constructor 
    public KidsAccount(String accNo, String name, double balnce){
        this.accNo=accNo;
        this.name=name;
        this.balance=balnce;
    }

    //Implementation for abstract withdraw method
    @Override
    public void withdraw(double amount){
        // kids cannot withdraw money more than Rs 500
        if(amount<balance){
            if(amount<=500){
                balance-=amount;
            }else{
                System.out.println("Error : Amount greater than Rs 500.00");
            }
        }else{
            System.out.println("Error : Insufficient balance");
        }
        
    }
}
