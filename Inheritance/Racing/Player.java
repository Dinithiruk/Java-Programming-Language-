package Racing;

public class Player {
	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	 public String getName() {
	        return name;
	    }
	
	public void performAction(String action) {
		System.out.println(name + " performs " + action);
	}

}
