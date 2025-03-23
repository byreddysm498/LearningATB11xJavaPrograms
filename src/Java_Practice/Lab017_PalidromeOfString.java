package JavaPrograms;
import java.util.Scanner;

public class Lab017_PalidromeOfString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter a String: ");
		String st = sc.next().toLowerCase();
		String palndm ="" ; 
		
		for(int i = st.length()-1; i>=0; i--) {
			palndm = palndm + st.charAt(i); 
			
		}
		System.out.println(st);
		System.out.println(palndm);
		if(palndm.equals(st)) {
			System.out.println("Entered string \""+st+"\" is palindrome.");
		}else 
		{
			System.out.println("Entered string \""+st+"\" is not a palindrome.");
		}

	}

}
