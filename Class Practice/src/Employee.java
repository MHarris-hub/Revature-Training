//Michael Harris
//Class Practice Assignment

public class Employee {
	private int id;
	private String name;
	private int age;
	private String email;
	private Project project;
	private Address presAddr;
	private Address permAddr;

	//constructor
	public Employee(int id, String name, int age, String email, Project project, Address presAddr, Address permAddr) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.project = project.copy();
		this.presAddr = presAddr.copy();
		this.permAddr = permAddr.copy();
	}

	//display formatted version of the employee information
	public String showInfo() {
		return ("---Employee Information--- " + '\n' +
				"ID: " + id + '\n' +
				"Name: " + name + '\n' +
				"Age: " + age + '\n' +
				"E-mail: " + email + "\n\n" +
				"---Project--- " + '\n' + project.showInfo() + '\n' +
				"---Present Address--- \n" + presAddr.showInfo() + '\n' +
				"---Permanent Address--- \n" + permAddr.showInfo() + '\n'
				);
	}
}