package org.me.oops;

/**
 * II Abstraction: Abstract class
 * 
 * Abstract class means deferring some definition\implementation of some
 * behaviour to child classes.
 * 
 * @author kekannag
 *
 */
public class GeometricalObjectTest {

	public static void main(String[] args) {
		GeometricalObject ci = new Circle();
		ci.draw();

		GeometricalObject re = new Rectangle();
		re.draw();
	}

}
