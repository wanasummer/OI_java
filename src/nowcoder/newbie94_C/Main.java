package newbie94_C;

import java.util.Scanner;

public class Main {
	//前缀和**一定要开long**
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n+2];
		for(int i = 1;i<=n;i++)a[i] = sc.nextLong();
		long[] pre = new long[n+2],last = new long[n+2];
		for(int i = 1;i<=n;i++) pre[i] = a[i] + pre[i-1];
		for(int i = n;i>=1;i--) last[i] = a[i] + last[i+1];
		long ans = Integer.MIN_VALUE;
		for(int i = 1;i<=n;i++) {
			//System.out.println(last[i+1] - a[i]);
			long t = Math.max(pre[i-1]-a[i],last[i+1] - a[i]);
			ans = Math.max(t, ans);
		}
		System.out.println(ans);
		sc.close();
	}
}
