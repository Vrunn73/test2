import java.lang.Math;
import java.util.Scanner;
public class Loops{
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		for (int i=2;i<101 ;i+=2) {
			System.out.print(i + " ");
		}
		System.out.println("");
		for (int i =100; i>2; i-=2) {
			System.out.print(i + " ");
		}
	}
}