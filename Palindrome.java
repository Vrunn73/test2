import java.lang.String;
import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args) throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter a palindrome :");
		String str = sc.nextLine();
		String strRev = reverse(str);
		System.out.println("\n"+strRev+"\n");
		System.out.println(str.equalsIgnoreCase(strRev) ?"Reversed word is "+strRev
															+". Hence it is a Palindrome\n"
														:"Reversed word is "+strRev
															+". Hence it is NOT a Palindrome\n");
	}
	public static String reverse(String a)throws InterruptedException {
		String b = "";
		for(int i = a.length()-1;i>=0;i--){
			b += a.charAt(i);
		}
		return b;
	}
}