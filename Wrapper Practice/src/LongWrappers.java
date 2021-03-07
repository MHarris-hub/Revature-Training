//Michael Harris
//Wrapper Assignment

public class LongWrappers {
	public static void main(String[] args) {
		Long l1 = 10L;
		Long l2 = 10L;
		Long l3 = 10L;

		System.out.println("l1 == l2: " + (l1 == l2));
		System.out.println("l1 == l3: " + (l1 == l3));
		System.out.println();

		System.out.println("l1.equals(l2): " + (l1.equals(l2)));
		System.out.println("l1.equals(l3): " + (l1.equals(l3)));
		System.out.println();

		System.out.println("Hash code of l1: " + System.identityHashCode(l1));
		System.out.println("Hash code of l2: " + System.identityHashCode(l2));
		System.out.println("Hash code of l3: " + System.identityHashCode(l3));
		System.out.println();

		l2++;
		System.out.println("Hash code of l2 after increment by 1: " + System.identityHashCode(l2));

		Long x = l2;   //auto boxing -> assign Object to primitive
		System.out.println("Autoboxed value of x: " + x);
		x = 7L;
		l2 = x;
		System.out.println("Value of l2 after being assigned x: " + l2);
		System.out.println();

		System.out.println("Long Min Value: " + Long.MIN_VALUE);
		System.out.println("Long Max Value: " + Long.MAX_VALUE);
		System.out.println();

		String s = "123";
		Long l4 = Long.parseLong(s);
		System.out.println("Value of l4 after using parseLong on String s: " + l4);
		System.out.println();

		//.longValue() is not defined - int is a "smaller" type than long
		//int i1 = l2.longValue(); //--this line will not work

		Long l5 = 22L;
		System.out.println("l5 compared to 19) : " + l5.compareTo(19L)); //1  because 22 > 19
		System.out.println("l5 compared to 22) : " + l5.compareTo(22L)); //0  because they are equal
		System.out.println("l5 compared to 33) : " + l5.compareTo(33L)); //-1 because 22 < 33
	}
}