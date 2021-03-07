package pack1;

public class FirstJavaClass {
	public static void main (String args[]) {
		System.out.println("Hello World");
		
		int x = 10;
		System.out.println("x = " + x);
		
		long l = 1234567890L;
		System.out.println("l = "+ l);
		
		float ratings = 12.33f;
		System.out.println("ratings = " + ratings);
		
		double salary = 2222.3333;
		System.out.println("salary: " + salary + " rating is " + ratings);
		
		char c = 'A';
		System.out.println(c);
		
		boolean b = false;
		System.out.println(b);
		
		//implicit casting
		int s = 100;
		double d = s;
		System.out.println("s = " + s);
		
		//explicit casting
		float a = .234f;
		int y = (int)a;
	}
}

/*
 * DataType			size(bytes)				default value
 * ------------------------------------------------------------
 * byte				1						0
 * short			2						0
 * int				4						0 - java reads default as int
 * long				8						0 - end it with L to make it a long else it defaults to int
 * 
 * float			4						0.00000f - end float values with f
 * double			8						0.00000d - all decimal values are read as double by default
 * 
 * char				2						'/u0000' java supports unicode character set
 * boolean			1						false
 * 
 * 
 * Casting - conversion of one data type to another
 * 
 * Implicit casting - taken care of by java compiler itself by default
 * in this you can assign any smaller size data type to a larger size type
 *
 * Explicit casting is done by the programmer for conversion of larger data types to smaller
 *
 *
 * static vs non-static
 * 1) static blocks can be accessed without creating an object because static blocks are loaded into memory directly
 * and they belong to the class, not a specific object
 * 
 * 2) non static blocks belong to the object or instance of the class which are accessible only after creation
 *
 */