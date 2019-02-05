package org.qualys.core.java.hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class MultipleRequestsAtTimeTest {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String fileName;
		fileName = scanner.nextLine();

		FileReader fr = new FileReader(new File(fileName));
		BufferedReader br = new BufferedReader(fr);

		HashMap<String, Integer> map = new HashMap<>();
		String line = null;
		FileWriter fw = new FileWriter(new File("req_" + fileName));
		BufferedWriter bw = new BufferedWriter(fw);

		try {
			while ((line = br.readLine()) != null) {
				String[] split = line.split(" ");
				Integer count = map.get(split[3]);
				if (count == null) {
					map.put(split[3], 1);
				} else {
					map.put(split[3], ++count);
				}
				if (map.get(split[3]) == 2) {
					bw.write(split[3].substring(1));
					bw.newLine();
				}
			}
		} finally {
			br.close();
			fr.close();
			bw.close();
			fw.close();
		}

	}

}
