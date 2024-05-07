package greety01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][2];
		int end = Integer.MIN_VALUE;
		for(int i = 0;i<n;i++) {
			a[i][0] = sc.nextInt();a[i][1] = sc.nextInt();
		}
		Arrays.sort(a,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
		});
		int ans = 0;
		for(int i = 0;i<n;i++) {
			if(end<a[i][0]) {
				end = a[i][1];
				ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
