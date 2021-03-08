//Michael Harris
//Exception Assignment

public class InvalidPassportNumber extends Exception{
	public InvalidPassportNumber() {
		super();
	}

	public InvalidPassportNumber (final String message) {
		super(message);
	}
}