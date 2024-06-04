package bfs1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		IO io = new IO();
		int n = io.nextInt(),m = io.nextInt();
		int[][] matrix = new int[n][m];
		for(int i = 0;i<n;i++)for(int j = 0;j<m;j++)matrix[i][j] = io.nextInt();
		Deque<int[]> dq = new ArrayDeque<int[]>();
		int[][] dis = new int[n][m];
		
		int[] dx = new int[] {-1,0,1,0},dy = new int[] {0,1,0,-1};
		dq.offer(new int[] {0,0});
		while(!dq.isEmpty()) {
			int[] coor = dq.poll();
			matrix[coor[0]][coor[1]] = 1;
			int distance = dis[coor[0]][coor[1]];
			for(int i = 0;i<4;i++) {
				int x = coor[0]+dx[i],y =coor[1]+dy[i];
				if(x>=n||y>=m||x<0||y<0||matrix[x][y]==1||dis[x][y]!=0)continue;
				dis[x][y]=distance+1;
				dq.offer(new int[] {x,y});
			}
		}
		io.print(dis[n-1][m-1]);
		io.close();
	}
}

class IO extends PrintWriter {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	public IO() {
		super(System.out);
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
	
	public int nextInt() {
		return Integer.parseInt(next());
	}
}