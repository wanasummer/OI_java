package cf4;


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
			int n = io.nextInt(),k = io.nextInt(),pb = io.nextInt(),ps = io.nextInt();
			int[] p = new int[n+1],a = new int[n+1];
			for(int i = 1;i<n+1;i++)p[i] = io.nextInt();
			for(int i = 1;i<n+1;i++)a[i] = io.nextInt();
			long ansB = a[pb]*k,ansS = a[ps]*k;
			int npB = p[pb],npS = p[ps];
			long preB = a[pb],preS = a[ps];
			for(int i = 1;i<Math.min(n, k);i++) {
				ansB = Math.max(ansB, preB+a[npB]*(k-i));
				ansS = Math.max(ansS, preS+a[npS]*(k-i));
				preB+=a[npB];preS+=a[npS];
				npB = p[npB];npS = p[npS];
			}
			if(ansB==ansS)io.println("Draw");
			else if (ansB>ansS)io.println("Bodya");
			else io.println("Sasha");
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
