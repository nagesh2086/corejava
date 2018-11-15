package org.me.core.java;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class CustomButton implements Serializable {
	private int id;
	private String label;
	private String action;

	public CustomButton(int id, String label, String action) {
		this.id = id;
		this.label = label;
		this.action = action;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "CustomButton [id=" + id + ", label=" + label + ", action=" + action + "]";
	}

	private final void readObject(ObjectInputStream in) throws IOException {
		throw new IOException();
	}
}
