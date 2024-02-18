package projectManagementTool;

import java.util.ArrayList;
import java.util.List;

public class Project {
	private String name;
	private String description;
	private List<Task> tasks;
	
	public Project(String name,String description) {
		this.name= name;
		this.description = description;
		this.tasks = new ArrayList<>();
	}
	public void addTask(Task projectTask) {
		tasks.add(projectTask);
	}
	public void removeTask(Task projectTask) {
		tasks.remove(projectTask);
	}
	public void displayTasks() {
		System.out.println("Tasks for the project " + name + ":");
		for (Task task : tasks) {
			System.out.println(task);
		}
	}
	public List<Project>getProjects(){
		return projects;
	}
	
	public String getName() {
		return name;
		
	}
	public String getDescription() {
		return description;
	}
	

}
