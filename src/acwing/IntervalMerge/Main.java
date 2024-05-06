package IntervalMerge;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int st = (int)-2e9,ed = (int)-2e9;
		int n = sc.nextInt();
		Integer[][] a = new Integer[n][2];
		for(int i = 0;i<n;i++) {
			int l = sc.nextInt(),r = sc.nextInt();
			a[i][0] = l;a[i][1] = r;
		}
		Arrays.sort(a,new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				return o1[0] - o2[0];
			}
		});
		int ans = 0;
		for(int i = 0;i<n;i++) {
			if(ed<a[i][0]) {
				st = a[i][0];ed = a[i][1];
				ans++;
			}else if(ed<a[i][1]) {
				ed = a[i][1];
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
