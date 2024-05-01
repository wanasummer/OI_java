package cf2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		IO io = new IO();
		int t = io.nextInt();
		while(t-->0) {
			char[] c = io.nextLine().toCharArray();
			int l = -1,r = 0;
			long ans = 0;
			for(;r<c.length;r++) {
				if(c[r]=='0'&&l!=-1) {
					ans += r-l+1;
					if(l+1!=r)l++;
					else l = r;
				}
				if(c[r]=='1'&&l==-1)l=r;
			}
			io.println(ans);
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

	public String nextLine() {try {
		return br.readLine();
	} catch (IOException e) {
		return null;
	}}
	
	public int nextInt() {
		return Integer.parseInt(next());
	}
}