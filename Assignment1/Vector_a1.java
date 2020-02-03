import java.util.*;
public class Vector_a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 10000000;
		int result = 0;
		Vector<Integer> vec = new Vector<>();
		
		long startTime = System.currentTimeMillis(); 
		for(int i=0; i<size; i++) {
			vec.add(getRandom(0,9));
		}
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Time took: " +elapsedTime);
		
		Iterator<Integer> iter = vec.iterator();
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
