package Racing;

import java.util.ArrayList;
import java.util.List;

public abstract class Team {
	protected String name;
	protected List<Player> players;
	
	public Team(String name) {
		this.name=name;
		this.players = new ArrayList<>();
	}
	public void addPlayer(Player player) {
		players.add(player);
		System.out.println(player.getName() + " added to "+ this.name);
	}
	public abstract void compete();

}
