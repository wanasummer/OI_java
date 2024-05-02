package cf2;


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
			int n = io.nextInt(),m = io.nextInt();
			char[] a = io.next().toCharArray(),b = io.next().toCharArray();
			int ans = 0;
			for(int i = 0,j = 0;i<b.length&&j<a.length;i++) {
				if(a[j]==b[i]) {
					ans++;
					j++;
				}
			}
			io.println(ans);
		}
		io.close();
	}

	static int gcd(int a,int b) {
		return b==0 ? a : gcd(b,a%b); 
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
