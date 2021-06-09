import java.util.Random;

public class Aufgabe3 {
	public static void main(String[] args) { 
	//int[] genRandomValues() {
		int[] zufallszahlen = new int[10];
		int arrayCounter = 0;
		Random random = new Random();
		int i = 0;
		while (i < 10) {
			
			int zufall = random.nextInt(100)+100;
			System.out.println(zufall);
			i++;
			do {
			zufallszahlen[arrayCounter] = zufall;
			arrayCounter++;
			} 
			while(arrayCounter != arrayCounter);
		}
		//return zufallszahlen;
				
	}
		
}
