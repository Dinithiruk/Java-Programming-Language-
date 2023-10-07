package Interface;


public class Invoice implements Payable{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    //Invoice constructor 
    public Invoice(String part,String description,int count,double price){
        partNumber = part;
        partDescription = description;
        quantity = count;
        pricePerItem = price;
    }
    
    //implementation for the getPaymentAmount method
    @Override
    public double getPaymentAmount(){
        return quantity * pricePerItem;
    }
}
