
public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Program to fibonacci");
		System.out.println("Enter Number of Terms");
		int n=1;
		int a=0; 
		int b=1;
		int c;
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				System.out.print(a);
			} else if (i == 1) {
				System.out.print("," + b);
			} else {
				c = a + b;
				System.out.print("," + c);
				a = b;
				b = c;
	}
	}
}
