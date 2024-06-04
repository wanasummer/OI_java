package bfs2;

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
		String start = "",end = "12345678x";
		for(int i = 0;i<3;i++)
			for(int j = 0;j<3;j++) {
				start += io.next().charAt(0);
			}
		Map<String, Integer> map = new HashMap<String, Integer>();
		Deque<String> dq = new ArrayDeque<String>();
		dq.offer(start);
		map.put(start, 0);
		int[] dx = new int[] {-1,0,1,0},dy = new int[] {0,1,0,-1};
		while(!dq.isEmpty()) {
			String s = dq.poll();
			if(s.equals(end)) {
				io.print(map.get(s));
				io.close();
				return;
			}
			int k = s.indexOf('x');
			int x = k/3,y = k%3;
			for(int i = 0;i<4;i++) {
				int xx = x+dx[i],yy = y+dy[i];
				if(xx >= 0 && xx < 3 && yy >= 0 && yy < 3) {
					char[] arr = s.toCharArray();
					swap(arr,k,xx*3+yy);
					String str = new String(arr);
					if(!map.containsKey(str)) {
						map.put(str,map.get(s)+1);
						dq.offer(str);
					}
				}	
			}
		}
		io.print(-1);
		io.close();
	}
	public static void swap(char[] arr,int x,int y) {
		char t = arr[x];
		arr[x] = arr[y];
		arr[y] = t;
	}
}

class IO extends PrintWriter {
	private BufferedReader br;
	private StringTokenizer st;

	public IO() {
		this(System.in, System.out);
	}

	public IO(InputStream in, OutputStream out) {
		super(out);
		br = new BufferedReader(new InputStreamReader(in));
	}

	public String next() {
		try {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		} catch (Exception e) {
		}
		return null;
	}

	public String nextLine() {
		st = null;
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