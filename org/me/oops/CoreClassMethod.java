package org.me.oops;

/**
 * Abstraction: It is the process by which we defer
 * definition\implementation\behavior to implementing sub-classes.
 * 
 * I Absraction: Interface
 * 
 * First form of Abstraction is Interface and worked for following example.
 * 
 * \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
 * public class CoreClassMethod {
 *
 * public static void main(String[] args) { NetworkStream nIS = new
 * NetworkStream(); nIS.display();
 *
 * SerialStream sIS = new SerialStream(); System.out.println("\n");
 * sIS.display();
 *
 * PCIStream pciIS = new PCIStream(); System.out.println("\n"); pciIS.display();
 * }
 *
 * }
 * 
 * \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
 * 
 * @author kekannag
 *
 */
public class CoreClassMethod {

	public static void main(String[] args) {
		/*
		 * IStream nIS = new NetworkStream(); nIS.display();
		 * 
		 * IStream sIS = new SerialStream(); System.out.println("\n"); sIS.display();
		 * 
		 * IStream pciIS = new PCIStream(); System.out.println("\n"); pciIS.display();
		 */

		NetworkStream nIS = new NetworkStream();
		nIS.display();
		nIS.showMeYourIntention();

		SerialStream sIS = new SerialStream();
		System.out.println("\n");
		sIS.display();
		sIS.showMeYourIntention();

		PCIStream pciIS = new PCIStream();
		System.out.println("\n");
		pciIS.display();
		pciIS.showMeYourIntention();
	}

}
