//Michael Harris
//Exception Assignment

public class InvalidLicenseNumber extends RuntimeException {
	public InvalidLicenseNumber() {
		super();
	}

	public InvalidLicenseNumber (final String message) {
		super(message);
	}
}