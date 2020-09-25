import java.util.Scanner;
public class Prime  {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. to check if its Prime : ");
		long n = scan.nextLong();
		if (n==1) {
			System.out.println("1 is neither prime nor composite");
	}else{
			for (long i=2; i<=n; i++) {
				if (n==i) {
					System.out.println(n+" is a prime number");
					break;
				}else if (n%i==0) {
					System.out.println(n+" is a composite number");
					break;
				}
			}

		}
	}
}