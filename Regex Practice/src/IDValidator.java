//Michael Harris
//Regex Practice

public class IDValidator {
	public static void main(String[] args) {
		String[] id = 	{	"123-45-6789",
							"012-34-564",
							"123456789",
							"ABC-DE-FGHI",
							"123 132 126"
						};

		//check for valid SSNs
		for (int i = 0; i < id.length; i++)
			if (id[i].matches("[0-9]{3}-[0-9]{2}-[0-9]{4}"))
				System.out.println("Value " + i + " is a valid SSN format.");
			else
				System.out.println("Value " + i + " is NOT a valid SSN format.");

		System.out.println();

		//check for valid passport numbers
		for (int i = 0; i < id.length; i++)
			if (id[i].matches("[0-9]{9}"))
				System.out.println("Value " + i + " is a valid passport number format.");
			else
				System.out.println("Value " + i + " is NOT a valid passport number format.");

		System.out.println();

		//check for valid driver's license numbers
		for (int i = 0; i < id.length; i++)
			if (id[i].matches("[0-9]{3} [0-9]{3} [0-9]{3}"))
				System.out.println("Value " + i + " is a valid driver's license number format.");
			else
				System.out.println("Value " + i + " is NOT a driver's license number format.");		
	}
}