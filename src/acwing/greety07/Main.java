package greety07;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] a = new long[n][2];
		for(int i = 0;i<n;i++) {
			a[i][0] = sc.nextLong();
			a[i][1] = sc.nextLong();
		}
		Arrays.sort(a,new Comparator<long[]>() {
			@Override
			public int compare(long[] o1, long[] o2) {
				return Long.compare(o1[0]+o1[1],o2[0]+o2[1]);
			}
		});
		long sum = 0;
		long ans = Long.MIN_VALUE;
		for(int i = 0;i<n;i++) {
			ans = Math.max(ans, sum-a[i][1]);
			sum += a[i][0];
		}
		System.out.println(ans);
		sc.close();
	}
}
