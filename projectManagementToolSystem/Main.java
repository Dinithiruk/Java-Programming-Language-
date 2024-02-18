package projectManagementTool;

public class Main {
	public static void main(String[] args) {
		ProjectManager pm1 = new ProjectManager();
		
		//creating developers
		Developer dev1 = new Developer("Kanishka", "kani@gmail.com");
		dev1.addSkill("Java , HTML,CSS ,JS");
		
		Developer dev2 = new Developer("Hiruni", "hiru@gmail.com");
		dev2.addSkill("Python, JS, react JS");
		
		Developer dev3 = new Developer("Kavya", "kavi@gmail.com");
		dev3.addSkill("Gaming,UI/UX");
		
		
		//Creating projects 
		pm1.createProject("Project A21","Ecommerce website project");
		pm1.createProject("Project A32", "Offroad Gaming App ");
		
		
		//Assigning tasks
		Task task1 = new Task("create UI for A21 project", "use figma tool","","");
		pm1.assignTask(pm1.getProjects().get(0),task1,dev1 );
		
		
		Task task2 = new Task("Write Unit tests", "Write tests cases","","");
		pm1.assignTask(pm1.getProjects().get(0), task2, dev2 );

		//Displaying projects and tasks
		pm1.displayProjects();
		pm1.getProjects().get(0).displayTasks();
		
		}
}
