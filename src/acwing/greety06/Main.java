package greety06;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++)a[i] = sc.nextInt();
		Arrays.sort(a);
		int[] pre = new int[n];
		pre[0] = 0;
		long ans = 0;
		for(int i = 1;i<n;i++) {
			pre[i] = pre[i-1] + a[i-1];
			ans += pre[i];
		}
		System.out.println(ans);
		sc.close();
	}
}
