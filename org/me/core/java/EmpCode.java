package org.me.core.java;

// complete the enum definition 
/**
 * 
 */
public enum EmpCode {
	ASSOCIATE(10001), SENIOR_ASSOCIATE(10002), MANAGER(10003), SENIOR_MANAGER(10004);

	private EmpCode(int code) {
		this.code = code;
	}

	private int code;

	public int getCode() {
		return this.code;
	}

	// also implement this method properly
	public static EmpCode getEnum(int code) {
		EmpCode[] empCodes = EmpCode.values();
		for (int i = 0; i < empCodes.length; i++) {
			if (empCodes[i].getCode() == code) {
				return empCodes[i];
			}
		}
		throw new IllegalArgumentException("code is not present in DB");
	}

} // end of public enum EmpCode