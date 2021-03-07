import java.util.Scanner;

public class ScannerLoops {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter you name: ");
		String name = sc.nextLine();
		System.out.println("Hello " + name + "!");
		
		System.out.println("Enter the minimum range: ");
		int min = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the maximum range: ");
		int max = Integer.parseInt(sc.nextLine());
	}
}