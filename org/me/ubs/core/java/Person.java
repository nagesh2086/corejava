package org.me.ubs.core.java;

public class Person {
	private String FirstName;
	private String lastName;
	private String aadharNumber;
	private double height;
	private int weight;
	private boolean isEmployed;
	private boolean isBusinessOwner;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public boolean isEmployed() {
		return isEmployed;
	}

	public void setEmployed(boolean isEmployed) {
		this.isEmployed = isEmployed;
	}

	public boolean isBusinessOwner() {
		return isBusinessOwner;
	}

	public void setBusinessOwner(boolean isBusinessOwner) {
		this.isBusinessOwner = isBusinessOwner;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FirstName == null) ? 0 : FirstName.hashCode());
		result = prime * result + ((aadharNumber == null) ? 0 : aadharNumber.hashCode());
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (isBusinessOwner ? 1231 : 1237);
		result = prime * result + (isEmployed ? 1231 : 1237);
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Person other = (Person) obj;
		if (FirstName == null) {
			if (other.FirstName != null) {
				return false;
			}
		} else if (!FirstName.equals(other.FirstName)) {
			return false;
		}
		if (aadharNumber == null) {
			if (other.aadharNumber != null) {
				return false;
			}
		} else if (!aadharNumber.equals(other.aadharNumber)) {
			return false;
		}
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height)) {
			return false;
		}
		if (isBusinessOwner != other.isBusinessOwner) {
			return false;
		}
		if (isEmployed != other.isEmployed) {
			return false;
		}
		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		if (weight != other.weight) {
			return false;
		}
		return true;
	}

}
