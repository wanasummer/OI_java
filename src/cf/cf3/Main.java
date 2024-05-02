package cf3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		IO io = new IO();
		int t = io.nextInt();
		while(t-->0) {
			int n = io.nextInt();
			int[] arr = new int[n];
			int[] a = new int[n];
			for(int i = 0;i<n-1;i++)arr[i] = io.nextInt();
			a[0] = 501;
			for(int i = 1;i<arr.length;i++) {
				a[i] = a[i-1]+arr[i-1]; 
			}
			for(int i:a)io.print(i+" ");
			io.println();
		}
		io.close();
	}

}

class IO extends PrintWriter {
	BufferedReader br;
	StringTokenizer st;

	public IO() {
		this(System.in, System.out);
	}

	public IO(InputStream in, OutputStream out) {
		super(out);
		br = new BufferedReader(new InputStreamReader(in));
	}

	public String next() {
		try {
			while (st == null || !st.hasMoreTokens()) {
				st = new StringTokenizer(br.readLine());
			}
			return st.nextToken();
		} catch (Exception e) {
		}
		return null;
	}

	public String nextLine() {
		try {
			return br.readLine();
		} catch (IOException e) {
			return null;
		}
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}
}
