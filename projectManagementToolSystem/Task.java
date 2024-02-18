package projectManagementTool;

public class Task {
	private String name;
	private String description;
	private Developer assignedDeveloper;
	private String status;
	
	public Task(String name,String description,String assignDeveloper,String status) {
		this.name=name;
		this.description= description;
		this.status= "open";
	}
	
	public void assignDeveloperToTask(Developer developer ) {
		this.assignedDeveloper=developer;
	}
	public void markAsCompleted() {
		this.status = "Done";
		
	}
	
	@Override
	public String toString() {
		return "Task: " + ", Description: "+ description + "Assigned Developer : "+ (assignedDeveloper != null? assignedDeveloper.getName(): "Unassigned") + ", Status: "+ status;
	}
	
}
