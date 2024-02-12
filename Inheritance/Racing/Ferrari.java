package Racing;

public class Ferrari extends Team{
	public Ferrari(String name) {
		super(name);
	}
	
	@Override
	public void compete() {
		System.out.println("Ferrari is competing in Formula 1 ");
	}

}
