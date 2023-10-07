package Interface;

public class Employee implements Payable{
    private int empNo;
    private String name;
    private double basicSalary;
    private float otHours;
    private double otHourPay; 

    //Employee constructor
    public Employee(int empNo,String name,double basicSalary,float otHours,double otHourPay){
        this.empNo=empNo;
        this.name=name;
        this.basicSalary=basicSalary;
        this.otHours=otHours;
        this.otHourPay=otHourPay;
    }

    //implementation for the getPaymentAmount method for employees
    @Override
    public double getPaymentAmount(){
        return basicSalary + (otHours * otHourPay);
    }
}
