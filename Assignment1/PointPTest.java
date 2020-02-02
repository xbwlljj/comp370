
// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

import java.util.*;

/**
 * This class prompts the user for a set of coordinates, and then converts them
 * from polar to cartesian or vice-versa.
 *
 */
public class PointPTest {

	private static Scanner sc;

	// Class methods *****************************************************

	public static void main(String[] args) {

		System.out.println("Design 2: Polar-Only Coordinates Program");
		sc = new Scanner(System.in);

		System.out.println("\nYou entered:");
		double rho = sc.nextDouble();
		double theta = sc.nextDouble();
		PointP p = new PointP(rho, theta);

		// Rotations

		long startTime = System.currentTimeMillis(); // timer is initiated, logging begins

		System.out.println("Testing 2000000 rotations with degree 5 for " + rho);
		for (int i = 0; i < 2000000; i++) {
			p = p.rotatePoint(5);
		}

		System.out.println("Testing 5000000 rotations with degree 3 for " + theta);
		for (int i = 0; i < 5000000; i++) {
			p = p.rotatePoint(3);
		}

		long stopTime = System.currentTimeMillis(); // timer is halted, logging stops
		long elapsedTime = stopTime - startTime; // computes time difference - reports the difference as time taken to
													// execute the block

		System.out.println("Time for rotations: " + elapsedTime + " milli second!!!!");

		// Distance

		startTime = System.currentTimeMillis(); // timer is initiated, logging begins

		System.out.println("\nTesting the distance of your point with other 4000000 points");
		for (int i = 0; i < 4000000; i++) {
			p.getDistance(new PointP(i,3.4));
		}

		stopTime = System.currentTimeMillis(); // timer is halted, logging stops
		elapsedTime = stopTime - startTime; // computes time difference - reports the difference as time taken to
											// execute the block

		System.out.println("Time for distance: " + elapsedTime + " milli second!!!!");

		System.out.println(p.toString());

	}

}
