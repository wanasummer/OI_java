package nk1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		IO io = new IO();
		int t = io.nextInt(),k = io.nextInt(),n = io.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		io.close();
	}
	
}

class IO extends PrintWriter{
	BufferedReader br;
	StringTokenizer st;
	public IO() {
		this(System.in,System.out);
	}
	public IO(InputStream in,OutputStream out) {
		super(out);
		br = new BufferedReader(new InputStreamReader(in));
	}
	public String next() {
		try {
			while(st==null||!st.hasMoreTokens()) {
				st = new StringTokenizer(br.readLine());
			}
			return st.nextToken();
		}catch(Exception e) {}
		return null;
	}
	
	public int nextInt() {return Integer.parseInt(next());}
}