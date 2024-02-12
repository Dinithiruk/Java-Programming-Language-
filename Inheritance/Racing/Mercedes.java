package Racing;

public class Mercedes extends Team{
	public Mercedes(String name) {
		super(name);
	}
	@Override
	public void compete() {
		System.out.println("Mercedes is competeing in Formula 1");
	}
 
}

