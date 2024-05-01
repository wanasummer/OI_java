package cf4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		IO io = new IO();
		int t = io.nextInt();
		while(t-->0) {
			int n = io.nextInt();
			char[] c = io.nextLine().toCharArray();
			int cnt_U = 0,cnt_D = 0;
			for(int i = 0;i<n;i++) {
				if(c[i]=='U')cnt_U++;
				else cnt_D++;
			}
			if((cnt_U&1)==1)io.println("YES");
			else io.println("NO");
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