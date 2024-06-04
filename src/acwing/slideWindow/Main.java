package slideWindow;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		IO sc = new IO();
		int n = sc.nextInt(), k = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
		Deque<Integer> maxDq = new ArrayDeque<Integer>();
		Deque<Integer> minDq = new ArrayDeque<Integer>();
		for (int i = 0; i < n; i++) {
			while (!minDq.isEmpty() && a[minDq.getLast()] >= a[i]) {
				minDq.removeLast();
			}
			minDq.addLast(i);
			if (i - minDq.getFirst() >= k)
				minDq.removeFirst();
			if (i >= k - 1)
				sc.print(a[minDq.getFirst()] + " ");
		}
		sc.println();
		for (int i = 0; i < n; i++) {
			while (!maxDq.isEmpty() && a[maxDq.getLast()] <= a[i]) {
				maxDq.removeLast();
			}
			maxDq.addLast(i);
			if (i - maxDq.getFirst() >= k)
				maxDq.removeFirst();
			if (i >= k - 1)
				sc.print(a[maxDq.getFirst()] + " ");
		}
		sc.close();
	}
}

class IO extends PrintWriter {
	private BufferedReader br;
	private StringTokenizer st;

	public IO() {
		super(System.out);
		br = new BufferedReader(new InputStreamReader(System.in));
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
