package Racing;

public class Vehicle {
	 protected String brand;
	 protected String model;
	 protected int year;
	 
	 public Vehicle(String brand,String model,int year) {
		 this.brand = brand;
		 this.model= model;
		 this.year = year;
	 }
	 public void drive() {
		 System.out.println("Vehicle is driving");
	 }

}
