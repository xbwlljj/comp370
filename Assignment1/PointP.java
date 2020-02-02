// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

/**
 * This class contains instances of coordinates in either polar or cartesian
 * format. It also provides the utilities to convert them into the other type.
 * It is not an optimal design, it is used only to illustrate some design
 * issues.
 *
 */
public class PointP {
	// Instance variables ************************************************

	private double rho;

	private double theta;

	// Constructors ******************************************************

	/**
	 * Constructs a coordinate object, with a type identifier.
	 */
	public PointP(double rho, double theta) {

		this.rho = rho;
		this.theta = theta;

	}

	// Instance methods **************************************************

	public double getRho() {

		return rho;
	}

	public double getTheta() {

		return theta;
	}

	public double getX() {

		return (Math.cos(Math.toRadians(theta)) * rho);
	}

	public double getY() {
		return (Math.sin(Math.toRadians(theta)) * rho);
	}

	/**
	 * Calculates the distance in between two points using the Pythagorean theorem
	 * (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
	 *
	 * @param pointA The first point.
	 * @param pointB The second point.
	 * @return The distance between the two points.
	 */
	public double getDistance(PointP pointB) {
	
		double deltaX = getX() - pointB.getX();
		double deltaY = getY() - pointB.getY();

		return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
	}

	/**
	 * Rotates the specified point by the specified number of degrees. Not required
	 * until E2.30
	 *
	 * @param point    The point to rotate
	 * @param rotation The number of degrees to rotate the point.
	 * @return The rotated image of the original point.
	 */
	public PointP rotatePoint(double rotation) {

		double radRotation = Math.toRadians(rotation);
		return new PointP(rho, theta + radRotation);
	}

	/**
	 * Returns information about the coordinates.
	 *
	 * @return A String containing information about the coordinates.
	 */
	public String toString() {
		return "Stored as " + "(" + rho + "," + theta + ")";
	}
}
