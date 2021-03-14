package com.cerence;

import java.util.Arrays;

public class SentenceAlphabeticalOrder {

	public static void main(String[] args) {
		String ipStr = "A aa A bb cc c zebra wat d a x p u vst v w i h g";
		String[] ip = ipStr.split(" ");
		
		for (int i = 0; i < ip.length-1; i++) {
			for (int j = i+1; j < ip.length; j++) {
				int k = ip[i].compareToIgnoreCase(ip[j]);
				if(k  > 0){
					System.out.println(ip[i] + " is greater than " + ip[j] + " so swapping those.");
					String temp = ip[i];
					ip[i] = ip[j];
					ip[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(ip));
	}

}
