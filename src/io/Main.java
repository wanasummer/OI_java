package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio();
		int i = io.nextInt();
		int j = io.nextInt();
		io.println(i);
		io.print(j);
		io.close();
	}

}

class Kattio extends PrintWriter {
	private BufferedReader br;
	private StringTokenizer st;
	public Kattio() {
		this(System.in,System.out);
	}

	public Kattio(InputStream i ,OutputStream o) {
		super(o);
		br = new BufferedReader(new InputStreamReader(i));
	}
	
	public String next() {
		try {
			while(st==null||!st.hasMoreTokens()) {
				st = new StringTokenizer(br.readLine());
			}
			return st.nextToken();
		}catch(Exception e) {
			
		}
		return null;
	}
	
	public int nextInt() {
		return Integer.parseInt(next());
	}
}