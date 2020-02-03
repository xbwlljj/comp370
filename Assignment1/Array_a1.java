
public class Array_a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10000000];
		int result = 0;
		
		long startTime = System.currentTimeMillis();
		for(int i=0; i< arr.length; i++)
		{
			arr[i] = getRandom(0, 9);
		}
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Time took to construct: "+ elapsedTime);
		
		long startTime1 = System.currentTimeMillis();
		for(int i=0; i<arr.length;i++) {
			result += arr[i];
		}
		long stopTime1 = System.currentTimeMillis();
		long elapsedTime1 = stopTime - startTime;
		System.out.println("Time took to sum: "+ elapsedTime1);
		System.out.println("sum: " + result);
	}
	private static int getRandom(int min, int max) {
		return (int)(Math.random() *((max - min) +1)) + min;
	}
}
