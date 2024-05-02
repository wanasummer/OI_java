package binary;

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
		int n = io.nextInt(), q = io.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++)a[i] = io.nextInt();
		while (q-- > 0) {
			int k = io.nextInt();
			int l = solveL(k, a);
			int r = solveR(k, a);
			io.println(l+" "+r);
		}
		io.close();
	}

	public static int solveL(int target, int[] arr) {
		int l = 0,r = arr.length-1;
		while(l<=r) {
			int mid = l+((r-l)>>1);
			if(arr[mid]>=target)r = mid - 1;
			else l = mid + 1;
		}
		return l>=0&&l<arr.length&&arr[l]==target ? l : -1;
	
	}
	
	public static int solveR(int target,int[] arr) {
		int l = 0,r = arr.length-1;
		while(l<=r) {
			int mid = l+((r-l)>>1);
			if(arr[mid]<=target)l = mid + 1;
			else r = mid - 1;
		}
		return r>=0&&r<arr.length&&arr[r]==target ? r : -1;
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
