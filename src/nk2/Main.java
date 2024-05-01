package nk2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		IO io = new IO();
		int n = io.nextInt(),h = io.nextInt();
		char[][] matrix = new char[5][n];
		for(int i = 0;i<matrix.length;i++) {
			matrix[i] = io.nextLine().toCharArray();
		}
		int cnt = 0;
		int cnt1 = 0;
		for(int i = 0;i<n;i++) {
			if(matrix[1][i]=='*')cnt++; 
			if(matrix[3][i]=='*')cnt++;
			if(matrix[0][i]=='*')cnt1++;
			if(matrix[4][i]=='*')cnt1++;
		}
		if(h<=cnt)io.print(cnt);
		else if((h-cnt)/2<=cnt1) io.print((h-cnt)/2+cnt);
		else io.print(cnt+cnt1);
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
	public String nextLine() throws IOException {return br.readLine();}
	
	public int nextInt() {return Integer.parseInt(next());}
}