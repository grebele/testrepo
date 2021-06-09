import java.awt.Rectangle;

public class Abschluss {
	public static void main(String[] args) { 
		
		Address ad01 = new Address("Strasse", "15", "3014", "Bern");
		Address ad02 = new Address("Strasse", "15", "3014", "Bern");
		Address ad03 = ad01; 

		ad01.setCity("Biel");
		ad03.setPostalCode("2502");

		System.out.println(ad01 == ad01);
		System.out.println(ad01 == ad03);
		System.out.println(ad01 == ad02);  
		System.out.println(ad01.equals(ad02)); 
		System.out.println(ad01.equals(ad03)); 
		System.out.println(ad02.equals(ad03));
		System.out.println("");
		
		
		Rectangle r1 = new Rectangle(1, 2, 3, 4);
		Rectangle r2 = r1;
		Rectangle r3 = new Rectangle(1, 2, 3, 4);
		

		//Rectangle r4 = r2; 
		//r4.translate(5, 5); 
		
		System.out.println(r1 == r2); 
		System.out.println(r1 == r3); 
		System.out.println(r2.equals(r3)); 
		System.out.println(r1.equals(r3)); 
		
		/*
		String s1 = "abc";
		String s2 = "abc";
		String s3 = "aabcde".substring(1, 4);
		String s4 = s3;
		System.out.println(s1 != s3);
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3)); 
		s4.toUpperCase();
		s2.toUpperCase();
		System.out.println(s3 != s4);
		System.out.println(s3.equals(s4));
		*/
		
}
}
