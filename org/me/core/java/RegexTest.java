package org.me.core.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile(PatternForMail.pattern);
		Matcher matcher = pattern.matcher("_+%xyz.dkf-@gm-ail..com");

		System.out.println(matcher.matches());
		boolean result;
		if (result = matcher.matches()) {
			System.out.println(matcher.group());
		}

		System.out.println(matcher.start());
		System.out.println(matcher.end());
	}

	public static class PatternForMail {
//		final static String pattern = "^[a-z0-9._%+-]+@[a-z0-9.-]+.[a-z]{2,6}$";
		final static String pattern = "^[a-z0-9._%+-]+@[a-z0-9.-]+.[a-z]{2,6}$";
	}
}
