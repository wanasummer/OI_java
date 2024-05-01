package cf3;

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
			Deque<Integer> dqA = new ArrayDeque<Integer>();
			Deque<Integer> dqB = new ArrayDeque<Integer>();
			for(int i = 0;i<n;i++)dqA.add(io.nextInt());
			for(int i = 0;i<n;i++)dqB.add(io.nextInt());
			long ans = 0;
			for(int i = 0;i<n;i++) {
				if(dqA.getFirst()>dqB.getFirst()) {
					dqA.removeLast();
					dqA.addFirst(dqB.getFirst());
					ans++;
				}
				dqA.removeFirst();
				dqB.removeFirst();
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