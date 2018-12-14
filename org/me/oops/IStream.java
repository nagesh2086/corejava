package org.me.oops;

@FunctionalInterface
public interface IStream {
	void display();

	default void showMeYourIntention() {
		System.out.println("IStream ***");
	}
}
