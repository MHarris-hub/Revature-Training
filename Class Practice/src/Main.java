//Michael Harris
//Class Practice Assignment

public class Main {
	public static void main(String[] args) {
		Project project1 = new Project(1, "Java Project", "Programmers Inc.");
		Address johnPresAddr = new Address(123, "Main St.", "New York", "NY", 11001);
		Address johnPermAddr = new Address(456, "Willow St.", "Portland", "OR", 52345);
		Employee john = new Employee(1, "John", 22, "john@mail.com", project1, johnPresAddr, johnPermAddr);
		
		System.out.print(john.showInfo());
	}
}