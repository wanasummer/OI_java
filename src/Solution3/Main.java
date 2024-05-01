package Solution3;

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
      int n = io.nextInt(),p = io.nextInt();
      Integer[] a = new Integer[n];
      for(int i = 0;i<n;i++)a[i] = io.nextInt();
      boolean hasOne = false,hasTwo = false;
      for(int i = 0;i<n;i++) {
    	  a[i] = a[i]%3;
    	  if(a[i]==1)hasOne = true;
    	  if(a[i]==2)hasTwo = true;
      }
      Arrays.sort(a);
      if(a[0]==0)io.print(1);
      else {
    	  if(hasOne&&hasTwo) io.print(2);
    	  else io.print(3);
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