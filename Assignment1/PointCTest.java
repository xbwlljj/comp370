
// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

import java.util.*;

/**
 * This class prompts the user for a set of coordinates, and then converts them
 * from polar to cartesian or vice-versa.
 *
 */
public class PointCTest {
	private static Scanner sc;

	// Class methods *****************************************************

	public static void main(String[] args) {

		System.out.println("Design 1: Cartesian-Only Coordinates Program");
		sc = new Scanner(System.in);

		System.out.println("\nYou entered:");
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		PointC c=new PointC(x,y);
		
		//Rotations
		
		long startTime = System.currentTimeMillis(); //timer is initiated, logging begins
		 
		System.out.println("Testing 2000000 rotations with degree 5 for " + x);
		    for (int i=0;i<2000000;i++) {
		      c = c.rotatePoint(5);
		    }

		    System.out.println("Testing 5000000 rotations with degree 3 for "+ y);
		    for (int i=0;i<5000000;i++) {
		      c = c.rotatePoint(3);
		    }
	
		long stopTime = System.currentTimeMillis(); //timer is halted, logging stops
		long elapsedTime = stopTime - startTime; //computes time difference - reports the difference as time taken to execute the block
	
		System.out.println("Time for rotations: " + elapsedTime + " milli second!!!!");
		
		
		//Distance
		
		startTime = System.currentTimeMillis(); //timer is initiated, logging begins
		
		System.out.println("\nTesting the distance of your point with other 4000000 points");
	    for (int i=0;i<4000000;i++) {
	      c.getDistance(new PointC(3.4,i));
	    }
	
		stopTime = System.currentTimeMillis(); //timer is halted, logging stops
		elapsedTime = stopTime - startTime; //computes time difference - reports the difference as time taken to execute the block
	
		System.out.println("Time for distance: " + elapsedTime + " milli second!!!!");

		System.out.println(c.toString());
		
	}
	
}
