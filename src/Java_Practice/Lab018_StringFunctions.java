package JavaPrograms;

public class Lab018_StringFunctions {

	public static void main(String[] args) {
		// String immutable
		String name = "Byreddy";
		name.toLowerCase();
		System.out.println(name); //name is still pointing to Byreddy
		
		
		//String creation in Java
		String st = "reddy";  //SCP - String constant pool
		
		String st2 = new String("reddy");   // OA - Object area
		
		System.out.println(name.concat(st));  // Concatination
		
		char c = 'A';
		System.out.println(c);
		
		String s1 = "ABCD";
		System.out.println(s1.length());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.concat("E"));
		
		//SCP
		String s2="Hello";
		String s3 = "Hello";
		
		//OA
		String s4 = new String("Hello");
		String s5 = new String("Hello");
		System.out.println(s2==s3); //true
		System.out.println(s4==s5); //false
		System.out.println(s2==s4); //false
		
		System.out.println(s2.equals(s4)); //true ->Content comparision
		System.out.println(s2.equals("hello"));
		
		System.out.println(name.charAt(2));  //charAt(index)
		System.out.println(name.contains("reddy")); //true
		
		
		
		
		

	}

}
