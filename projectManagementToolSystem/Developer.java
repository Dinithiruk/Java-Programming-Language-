package projectManagementTool;

import java.util.ArrayList;
import java.util.List;

public class Developer {
	private String name;
	private String email;
	private List<String> skills;
	
	public Developer(String name,String email) {
		this.name=name;
		this.email=email;
		this.skills=new ArrayList<>();
	}
	
	public void addSkill(String skill) {
		skills.add(skill);
	}
	public void removeSkill(String skill) {
		skills.remove(skill);
	}
	
	public String getName() {
		return name;
	}
	 
	
}
