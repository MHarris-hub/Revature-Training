//Michael Harris
//Wrapper Assignment

public class DoubleWrappers {
	public static void main(String[] args) {
		Double d1 = 10.0d;
		Double d2 = 10.0d;
		Double d3 = 10.0d;

		System.out.println("d1 == d2: " + (d1 == d2));
		System.out.println("d1 == d3: " + (d1 == d3));
		System.out.println();

		System.out.println("d1.equals(d2): " + (d1.equals(d2)));
		System.out.println("d1.equals(d3): " + (d1.equals(d3)));
		System.out.println();

		System.out.println("Hash code of d1: " + System.identityHashCode(d1));
		System.out.println("Hash code of d2: " + System.identityHashCode(d2));
		System.out.println("Hash code of d3: " + System.identityHashCode(d3));
		System.out.println();

		d2++;
		System.out.println("Hash code of d2 after increment by 1: " + System.identityHashCode(d2));

		Double x = d2;   //auto boxing -> assign Object to primitive
		System.out.println("Autoboxed value of x: " + x);
		x = 7.0d;
		d2 = x;
		System.out.println("Value of d2 after being assigned x: " + d2);
		System.out.println();

		System.out.println("Double Min Value: " + Double.MIN_VALUE);
		System.out.println("Double Max Value: " + Double.MAX_VALUE);
		System.out.println();

		String s = "123";
		Double d4 = Double.parseDouble(s);
		System.out.println("Value of d4 after using parseDouble on String s: " + d4);
		System.out.println();

		//.doubleValue() is not defined - float is a "smaller" type than double
		//Float f1 = d2.doubleValue(); //--this line will not work

		Double d5 = 22d;
		System.out.println("d5 compared to 19) : " + d5.compareTo(19d)); //1  because 22 > 19
		System.out.println("d5 compared to 22) : " + d5.compareTo(22d)); //0  because they are equal
		System.out.println("d5 compared to 33) : " + d5.compareTo(33d)); //-1 because 22 < 33
	}
}