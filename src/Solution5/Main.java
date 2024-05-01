package Solution5;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
	static long ans = -1;
	static int n;
	static int[] a,b,c;
    public static void main(String[] args) {
    	IO io = new IO();
    	n = io.nextInt();
    	a = new int[n];b = new int[n];c = new int[n];
    	for(int i = 0;i<n;i++)a[i] = io.nextInt();
    	for(int i = 0;i<n;i++)b[i] = io.nextInt();
    	for(int i = 0;i<n;i++)c[i] = io.nextInt();
    	dfs(0,0,0,0,0);
    	io.print(ans);
    	io.close();
    }
    
    static void dfs(long sA,long sB,long sC,int i,int max) {
    	if(i>=n)return;
    	if(sA+sB<sC||sB+sC<sA||sA+sC<sB) ans = Math.max(max, ans);
    	dfs(sA+a[i],sB+b[i],sC+c[i],i+1,max+1);
    	dfs(sA,sB,sC,i+1,max);
    }
}

class IO extends PrintWriter{
	BufferedReader br;
	StringTokenizer st;
	public IO() {
		this(System.in,System.out);
	}
	public IO(InputStream in,OutputStream out) {
		super(out);
		br = new BufferedReader(new InputStreamReader(in));
	}
	public String next() {
		try {
			while(st==null||!st.hasMoreTokens()) {
				st = new StringTokenizer(br.readLine());
			}
			return st.nextToken();
		}catch(Exception e) {}
		return null;
	}
	
	public int nextInt() {return Integer.parseInt(next());}
}