package Solution4;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main{
    
    public static void main(String[] args) {
      IO io = new IO();
      int n = io.nextInt();
      char[] A = io.next().toCharArray();
      int[] a = new int[n];
      for(int i = 0;i<n;i++)a[i] = A[i] - '0';
      char[] B = io.next().toCharArray();
      int[] b = new int[n];
      for(int i = 0;i<n;i++)b[i] = B[i] - '0';
      int q = io.nextInt();
      for(int i = 0;i<q;i++) {
    	  char c = io.next().charAt(0);
    	  int l = io.nextInt(),r = io.nextInt();
    	  long ans = 0;
    	  for(int j = 0;j<n;j++) {
    		  if(j>=l-1&&j<=r-1) {
    			  if(c=='A')a[j]=1;
    			  else b[j]=1;
    		  }
    		  if(a[j]==b[j]&&a[j]==1)ans++;
    	  }
    	  io.println(ans);
      }
      io.close();
    }
    
    
} 

class IO extends PrintWriter{
    BufferedReader br;
    StringTokenizer st;
    public IO(InputStream in,PrintStream out) {
        super(out);
        br = new BufferedReader(new InputStreamReader(in));
    }
    public IO() {
        this(System.in,System.out);
    }
    
    public String next() {
        try {
            while(st==null||!st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }catch(Exception e) {}
        return null;
    }
    
    public int nextInt() {return Integer.parseInt(next());}
    public long nextLong() {return Long.parseLong(next());}
}