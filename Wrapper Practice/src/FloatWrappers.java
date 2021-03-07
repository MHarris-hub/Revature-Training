//Michael Harris
//Wrapper Assignment

public class FloatWrappers {
	public static void main(String[] args) {
		Float f1 = 10.0f;
		Float f2 = 10.0f;
		Float f3 = 10.0f;

		System.out.println("f1 == f2: " + (f1 == f2));
		System.out.println("f1 == f3: " + (f1 == f3));
		System.out.println();

		System.out.println("f1.equals(f2): " + (f1.equals(f2)));
		System.out.println("f1.equals(f3): " + (f1.equals(f3)));
		System.out.println();

		System.out.println("Hash code of f1: " + System.identityHashCode(f1));
		System.out.println("Hash code of f2: " + System.identityHashCode(f2));
		System.out.println("Hash code of f3: " + System.identityHashCode(f3));
		System.out.println();

		f2++;
		System.out.println("Hash code of f2 after increment by 1: " + System.identityHashCode(f2));

		float x = f2;   //auto boxing -> assign Object to primitive
		System.out.println("Autoboxed value of x: " + x);
		x = 7.0f;
		f2 = x;
		System.out.println("Value of f2 after being assigned x: " + f2);
		System.out.println();

		System.out.println("Float Min Value: " + Float.MIN_VALUE);
		System.out.println("Float Max Value: " + Float.MAX_VALUE);
		System.out.println();

		String s = "123";
		Float f4 = Float.parseFloat(s);
		System.out.println("Value of f4 after using parseFloat on String s: " + f4);
		System.out.println();

		Double d1 = f2.doubleValue();
		System.out.println("Value of d1 after being cast to double: " + d1);
		System.out.println();

		Float f5 = 22f;
		System.out.println("f5 compared to 19) : " + f5.compareTo(19f)); //1  because 22 > 19
		System.out.println("f5 compared to 22) : " + f5.compareTo(22f)); //0  because they are equal
		System.out.println("f5 compared to 33) : " + f5.compareTo(33f)); //-1 because 22 < 33
	}
}