import java.util.*;

public class ArrayList_a1 {
	
	public static void main (String args[]) {
		int size = 10000000;
		int result = 0;
		ArrayList<Integer> value = new ArrayList<>();
		long startTime = System.currentTimeMillis();
		for(int i=0; i<size; i++) {
			value.add(getRandom(0,9));
		}
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Time took to construct: "+elapsedTime);
		
		Iterator<Integer> iter = value.iterator();
		long startTime1 = System.currentTimeMillis();
		
		while(iter.hasNext()) {
			result += iter.next();
		}
		
		long stopTime1 = System.currentTimeMillis();
		long elapsedTime1 = stopTime1 - startTime1;
		
		System.out.println("Time took to sum: "+elapsedTime1);
		System.out.println(result);
	}
	
	private static int getRandom(int min, int max) {
		return (int)(Math.random() *((max - min) +1)) + min;
	}
}
