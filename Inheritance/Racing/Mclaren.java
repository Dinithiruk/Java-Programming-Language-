package Racing;

public class Mclaren extends Team{
	public Mclaren(String name) {
		super(name);
	}
	
	@Override
	public void compete() {
		System.out.println("McLaren is competing in Formula 1");
	}

}
