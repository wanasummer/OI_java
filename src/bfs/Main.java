package bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StreamTokenizer st = new StreamTokenizer(br);

	static int nextInt() throws Exception {
		st.nextToken();
		return (int) st.nval;
	}

	static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

	static class node {
		int a, b, c;

		node(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}

	static boolean vis[][][] = new boolean[21][21][21];

	static node[] t = new node[21 * 21 * 21];
	static int p1, p2;
	static int ma, mb, mc;

	public static void main(String[] args) throws Exception {
		ma = nextInt();
		mb = nextInt();
		mc = nextInt();
		bfs(0, 0, mc);
		for (int c = 0; c <= mc; c++) {
			for (int b = 0; b <= mb; b++) {
				if (vis[0][b][c]) {
					pw.print(c + " ");

				}
			}
		}
		pw.flush();
	}

	static void bfs(int a, int b, int c) {
		vis[0][0][c] = true;
		t[p2++] = new node(a, b, c);
		while (p1 < p2) {
			node n = t[p1++];
			a = n.a;
			b = n.b;
			c = n.c;
			pour(a - Math.min(a, mb - b), Math.min(a + b, mb), c);
			pour(a - Math.min(a, mc - c), b, Math.min(a + c, mc));
			pour(Math.min(a + b, ma), b - Math.min(b, ma - a), c);
			pour(a, b - Math.min(b, mc - c), Math.min(c + b, mc));
			pour(Math.min(a + c, ma), b, c - Math.min(c, ma - a));
			pour(a, Math.min(b + c, mb), c - Math.min(c, mb - b));
		}
	}

	static void pour(int a, int b, int c) {
		if (!vis[a][b][c]) {
			vis[a][b][c] = true;
			t[p2++] = new node(a, b, c);
		}
	}
}