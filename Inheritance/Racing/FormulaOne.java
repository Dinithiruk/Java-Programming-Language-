package Racing;

public class FormulaOne extends Vehicle{
	private String team;
	
	public FormulaOne(String brand,String model,int year, String team) {
		super(brand,model,year);
		this.team=team;
	}
	@Override
	public void drive() {
		System.out.println("--- Formula 1 Racing ----");
	}

}
