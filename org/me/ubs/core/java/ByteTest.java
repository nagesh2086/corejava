package org.me.ubs.core.java;

/**
 * java.lang.Error: Unresolved compilation problem: line1
 * @author kekannag
 *
 */
public class ByteTest {

	public static void main(String[] args) {
		byte var = 1;//line 0
		//var = (byte) var*0;//line 1
		var = (byte) (var*0);
		byte data = (byte) (var*0);//line 2
		System.out.println(var);
	}

}
