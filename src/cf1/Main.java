package cf1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		IO io = new IO();
		int n = io.nextInt();
		long sum = 0;
		int[] a = new int[n];
		for(int i = 0;i<n;i++)a[i] = io.nextInt();
		int c = io.nextInt();
		for(int i = 0;i<n;i++) {
			int t = a[i]+1;
			sum += f(t,c);
		}
		io.print(sum);
		io.close();
	}

	static long f(int x, int c) {
		int count = 1;
		while (x / 3 != c) {
			if(x/3<c)return 0;
			x /= 3;
			count++;
		}
		return qsm(2,count);
	}

	static long qsm(int x, int y) {
		long res = 1;
		while (y > 0) {
			if ((y & 1) == 1) {
				res *= x;
				y--;
			}
			x *= x;
			y >>= 1;

		}
		return res;
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

	public int nextInt() {
		return Integer.parseInt(next());
	}
}