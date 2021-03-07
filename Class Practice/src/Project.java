//Michael Harris
//Class Practice Assignment

public class Project {
	private int id;
	private String name;
	private String clientName;

	//constructor
	public Project(int id, String name, String clientName) {
		this.id = id;
		this.name = name;
		this.clientName = clientName;
	}

	//display a formatted version of the projact information
	public String showInfo() {
		return ("ID: " + id + '\n' +
				"Name: " + name + '\n' +
				"Client Name: " + clientName + '\n'
				);
	}

	//return a deep copy of the project
	public Project copy() {
		return new Project(this.id, this.name, this.clientName);
	}
}