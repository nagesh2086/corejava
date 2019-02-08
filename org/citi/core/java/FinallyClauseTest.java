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
 * 3. If we pass method argument, return it from try-clause and modify it again
 * in finally-block then outside method, whatever value has been returned that
 * will be available.
 * 
 * @author kekannag
 *
 */
public class FinallyClauseTest {
	private int j = 0;

	public static void main(String[] args) {
		System.out.println("\n 1. changeValOfIInFinally()");
		int i = changeValOfIInFinally();
		System.out.println("Val of I in main -> " + i);

		System.out.println("\n 2. changeValOfMemberJ(0) passing j as method argument");
		FinallyClauseTest f = new FinallyClauseTest();
		f.changeValOfMemberJ(f.j);
		System.out.println("Val of J in main -> " + f.j);
		
		System.out.println("\n 2. changeValOfMemberJWithoutAsMethodArgument(NO METHOD ARGUMENT) ");
		f.changeValOfMemberJWithoutAsMethodArgument();
		System.out.println("Val of J in main -> " + f.j);

		System.out.println("\n 3. changeValOfMethodArgumentK(0)");
		final int k = changeValOfMethodArgumentK(0);
		System.out.println("Val of K in main -> " + k);
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

	private int changeValOfMemberJ(int j) {
		try {
			j = 100;
			return j;
		} finally {
			j = 200;
			System.out.println("\nfinally block --> Value of j is " + j + "\n");
		}
	}
	
	private int changeValOfMemberJWithoutAsMethodArgument() {
		try {
			j = 100;
			return j;
		} finally {
			j = 200;
			System.out.println("\nfinally block --> Value of j is " + j + "\n");
		}
	}

	private static int changeValOfMethodArgumentK(int k) {
		try {
			k = 100;
			return k;
		} finally {
			k = 200;
			System.out.println("\nfinally block --> Value of k is " + k + "\n");
		}
	}

}
