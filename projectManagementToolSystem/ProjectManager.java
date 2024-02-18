package projectManagementTool;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.management.Descriptor;

public class ProjectManager {
	private List <Project> projects;
	
	public  ProjectManager() {
		this.projects = new ArrayList<>();
	}
	
	public void createProject(String name, String description) {
		Project project = new Project( name, description);
		projects.add(project);
	}
	public void assignTask(Project project,Task task,Developer developer) {
		task.assignDeveloperToTask(developer);
		project.addTask(task);
	}
	public void displayProjects() {
		System.out.println("--- All Projects --- : ");
		for(Project project : projects){
			System.out.println("Projects: "+ project.getName() + ", Description: " + project.getDescription());
		}
		
	}
	public List<Project>getProjects(){
		return projects;
		}
}
