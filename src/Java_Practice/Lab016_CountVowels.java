package JavaPrograms;

import java.util.Scanner;

public class Lab016_CountVowels {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the String: ");
		String st = sc.next().toLowerCase();
		
		//System.out.println(st);
		
		int vcnt = 0;
		int conscnt = 0;
		
		Boolean cndchk=true;
		while(cndchk) {
			if(st.matches("[a-z]+")) {
				cndchk = false;
			}else {
			
				System.out.println("Entered string is inavild please enter string contains only Alphabets: ");
				System.out.println("Please enter the String: ");
				st = sc.next().toLowerCase();
				System.out.println(st);;
				
			}
			
		}
			
		
		for(int i =0; i<st.length(); i++) {
			char extrst = st.charAt(i);
			
			if(extrst=='a' || extrst=='e' || extrst=='i' || extrst=='o' || extrst=='u') {
				vcnt++;
				
			}
			else {
				conscnt++;
			}
			
		}
		
		
		
		System.out.println("The count of vowels is: "+vcnt);
		System.out.println("The count of consonants is: "+conscnt);
			
		

	}

}

//Count vowels(a,e,i,o,u) and consonants in a String. 
