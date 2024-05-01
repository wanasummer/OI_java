package Solution2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

//记得去掉package
public class Main {
	static long ans;
	public static void main(String[] args) {
		IO io = new IO();
		int n = io.nextInt();
		int[] a = new int[n];
		int[] s = new int[32];
		for(int i = 0;i<n;i++)a[i] = io.nextInt();
		for(int i = 0;i<n;i++) {
			int d = a[i],p = 0;
			while(d>0) {
				if((d&1)==1)s[p]++;
				p++;
				d>>=1;
			}
		}
		for(int i = 0;i<n;i++) {
			int d = a[i],p = 0;
			while(d>0) {
				if((d&1)==1)s[p]--;
				p++;
				d>>=1;
			}
			d = a[i];p = 0;
			while(d>0) {
				if((d&1)==1)ans+=s[p];
				p++;
				d>>=1;
			}
			
		}
		io.print(ans);
		io.close();
	}
	
	
}

class IO extends PrintWriter {
	BufferedReader br;
	StringTokenizer st;

	public IO(InputStream in, PrintStream out) {
		super(out);
		br = new BufferedReader(new InputStreamReader(in));
	}

	public IO() {
		this(System.in, System.out);
	}

	public String next() {
		try {
			while (st == null || !st.hasMoreElements()) {
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

	public long nextLong() {
		return Long.parseLong(next());
	}
}