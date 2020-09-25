import java.util.Scanner;
public class PrimeB{
	public static void main(String[] args) {
		System.out.println("Enter Input :");
		int i = new Scanner(System.in).nextInt();
		int j = new Scanner(System.in).nextInt();
		for (int a=i; a<=j; a++) {
			if(isPrime(a)){
				System.out.println(a);
			}
			continue;
		}
	}
	public static boolean isPrime(int i){
		for (int k=2; k<=i/2; k++) {
			if(i%k==0){
				return false;
			}
		}	
		return true;
	}
}