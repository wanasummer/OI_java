package greety03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][2];
		for(int i = 0;i<n;i++) {
			int l = sc.nextInt(),r = sc.nextInt();
			a[i][0] = l;a[i][1] = r;
		}
		Arrays.sort(a,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
		});
		for(int i = 0;i<n;i++) {
			if(pq.isEmpty()||a[i][0]<=pq.peek()[1]) {
				pq.add(a[i]);
			}else {
				pq.poll();
				pq.add(a[i]);
			}
		}
		System.out.println(pq.size());
		sc.close();
	}
}
