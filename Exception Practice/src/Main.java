//Michael Harris
//Exception Assignment

public class Main {
	public static void main(String[] args) {
		String[] id = 	{	"123-45-6789",
							"012-34-564",
							"123456789",
							"ABC-DE-FGHI",
							"123 132 126"
						};

		System.out.println("-----Check Passports-----" );
		for (int i = 0; i < id.length; i++)
			try {
				if (validatePassport(id[i]))
					System.out.println("The entered value is a valid passport number.");
			} catch (InvalidPassportNumber e) {
				System.out.println(e.getMessage());
			}

		System.out.println();

		System.out.println("-----Check Driver's Licenses-----" );
		for (int i = 0; i < id.length; i++)
			try {
				if (validateLicense(id[i]))
					System.out.println("The entered value is a valid driver's license number.");
			} catch (InvalidLicenseNumber e) {
				System.out.println(e.getMessage());
			}
	}

	//check for valid passport number
	private static boolean validatePassport(String passport) throws InvalidPassportNumber {
		if (passport.matches("[0-9]{9}"))
			return true;

		throw new InvalidPassportNumber("The entered value is NOT a valid passport number.");
	}

	//check for valid driver's license number
	private static boolean validateLicense(String license) throws InvalidLicenseNumber {
		if (license.matches("[0-9]{3} [0-9]{3} [0-9]{3}"))
			return true;

		throw new InvalidLicenseNumber("The entered value is NOT valid a driver's license number.");
	}
}