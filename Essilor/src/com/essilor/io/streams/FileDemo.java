package com.essilor.io.streams;

import java.io.*;

class FileDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new FileReader("srinuvas.txt"));
		PrintWriter out = new PrintWriter("srinuvasp.txt");
		String target = br1.readLine();
		while (target != null) {
			boolean available = false;
			BufferedReader br2 = new BufferedReader(new FileReader("srinuvasp.txt"));
			String line = br2.readLine();
			while (line != null) {
				if (target.equals(line)) {
					available = true;
					break;
				}
				line = br2.readLine();
			}
			if (available == false) {
				out.println(target);
				out.flush();
			}
			target = br1.readLine();
		}
	}
}
