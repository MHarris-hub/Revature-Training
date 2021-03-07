//Michael Harris
//Class Practice Assignment

public class Address {
	private int number;
	private String street;
	private String city;
	private String state;
	private int zip;

	//constructor
	public Address(int number, String street, String city, String state, int zip) {
		this.number = number;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	//display formatted version of the address information
	public String showInfo() {
		return ("Number: " + number + '\n' +
				"Street: " + street + '\n' +
				"City: " + city + '\n' +
				"State: " + state + '\n' +
				"Zip: " + zip + '\n'
				);
	}

	//return a deep copy of the address
	public Address copy() {
		return new Address(this.number, this.street, this.city, this.state, this.zip);
	}
}