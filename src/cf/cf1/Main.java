package cf1;


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
			int x = io.nextInt();
			int max = 0,ans = 0;
			int y = x;
			while(--y>=1) {
				int tt = gcd(x,y)+y;
				if(tt>=max) {
					max = tt;
					ans = Math.max(ans, y);
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
