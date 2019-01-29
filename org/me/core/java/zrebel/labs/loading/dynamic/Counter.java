package org.me.core.java.zrebel.labs.loading.dynamic;

public class Counter implements ICounter {
	private int counter;

	@Override
	public String message() {
		return "Version 1";
	}

	@Override
	public int plusPlus() {
		return counter++;
	}

	@Override
	public int counter() {
		return counter;
	}
}