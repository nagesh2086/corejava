package org.citi.core.java;

/**
 * If we set value of variable i in finally after return stmt in try then what
 * value will be printed.
 * 
 * 1. If variable i is local and returning from try{} and changing in finally{}
 * then whatever value at the time of return stmt will available outside
 * method().
 * 
 * i is local var as well as it returned before finally so i is modified and the
 * value of modified i will not be available outside method() because i is
 * local.o
 * 
 * 2. If variable j is member variable of class, returning from try{} as well as
 * modified in finally{} then whatever value modified in finally{} will be
 * available.
 * 
 * @author kekannag
 *
 */
public class FinallyClauseTest {
	private int j = 0;

	public static void main(String[] args) {
		int i = changeValOfIInFinally();
		System.out.println("Val of I in main -> " + i);

		FinallyClauseTest f = new FinallyClauseTest();
		f.changeValOfMemberJ();
		System.out.println("Val of J in main -> " + f.j);
	}

	private static int changeValOfIInFinally() {
		int i;
		try {
			i = 100;
			return i;
		} finally {
			i = 200;
			System.out.println("finally block --> Value of i is " + i + "\n");
		}
	}

	private int changeValOfMemberJ() {
		try {
			j = 100;
			return j;
		} finally {
			j = 200;
			System.out.println("\nfinally block --> Value of j is " + j + "\n");
		}
	}

}
