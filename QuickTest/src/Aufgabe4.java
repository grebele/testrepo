import java.util.ArrayList;

public class Aufgabe4 {
	public static void main(String[] args) { 
		
	ArrayList<Integer> someValues = new ArrayList<Integer>();
	someValues.add(1240);
	someValues.add(134);
	someValues.add(1);
	someValues.add(0);
	
	int pos = -1;
	int i = 0;
	do {
		if (someValues.get(i) > 99)	// found!
			pos = i;
		i++;
	}
	while (i < someValues.size() && pos != -1) ;
	
		System.out.println("First value > 99 found at pos: " + pos);
	
}
}
