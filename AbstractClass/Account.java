package AbstractClass;

public abstract class Account {
    protected String accNo;
    protected String name;
    protected double balance;

    public void deposit(double amount){
        balance = balance += amount;
    }

    //abstract withdraw method 
    public abstract void withdraw(double amount);

    public void display(){
        System.out.println(this.accNo + " " + this.name + " " + this.balance);
    }

}
