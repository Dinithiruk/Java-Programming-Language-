package Racing;

public class Main {
	
	public static void main(String[] args) {
		//Formula one cars objects
		FormulaOne car1 = new FormulaOne("Mercedes", "Benz AMG",2013 , "Mercedes");
		FormulaOne car2 = new FormulaOne("Mclaren", "MCL04", 2013, "McLaren");
		FormulaOne car3 = new FormulaOne("Ferrari", "SF26", 2013, "Ferrari");
		
		//Team objects
		Team mercedesTeam = new Mercedes("Mercedes");
		Team mclarenTeam = new Mclaren("McLaren");
		Team ferrariTeam = new Ferrari("Ferrari");
		
		//Adding Players
		Player player1 = new Player("Lewis Hamilton");
		Player player2 = new Player("Peter Pattison");
		Player player3 = new Player("Charles Lecrec");
		
		System.out.println("--- Players Name list \n");

		//assigning players to teams 
		mercedesTeam.addPlayer(player1);
		mclarenTeam.addPlayer(player2);
		ferrariTeam.addPlayer(player3);
		
		System.out.println("\n");

		
		//calling the compete methods 
		car1.drive();
		car2.drive();
		car3.drive();
		
		System.out.println("\n \n--- Competing car list ---\n");

        mercedesTeam.compete();
        mclarenTeam.compete();
        ferrariTeam.compete();
	}
	
	
}
