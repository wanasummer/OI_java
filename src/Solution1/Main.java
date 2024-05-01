package Solution1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main{
    
    public static void main(String[] args) {
        IO io = new IO();
        int n = io.nextInt(),q = io.nextInt();
        String s = (char)0+io.next()+(char)0;
        char[] c = s.toCharArray();
        long[] dif = new long[c.length];
        for(int i = 0;i<q;i++) {
            int l = io.nextInt(),r = io.nextInt(),k = io.nextInt();
            dif[l]+=k;
            dif[r+1]-=k;
        }
        for(int i = 1;i<c.length-1;i++) dif[i]+=dif[i-1];
        for(int i = 1;i<c.length-1;i++) {
            long offset = c[i] - 'a';
            offset = (offset+dif[i])%26;
            io.print((char)('a' + offset));
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