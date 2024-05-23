package Knapsack02_opt;

import java.util.Scanner;
//多重背包问题
//二进制优化
public class Main {
	static int N = 2000010,V = 2010;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),m = sc.nextInt();
		int[] dp = new int[V];
		int[] v = new int[N],w = new int[N];
		int cnt = 0;
		for(int i = 1;i<=n;i++) {
			int vv = sc.nextInt(),ww = sc.nextInt(),s = sc.nextInt();
			for(int k = 1;k<=s;k<<=1) {
				v[++cnt] = vv * k;
				w[cnt] = ww * k;
				s-=k;
			}
			if(s>0) {
				v[++cnt] = vv * s;
				w[cnt] = ww * s;
			}
		}
		n = cnt;
		for(int i = 1;i<=n;i++) {
			for(int j = m;j>=v[i];j--) {
				dp[j] = Math.max(dp[j], dp[j-v[i]]+w[i]);
			}
		}
		System.out.println(dp[m]);
		sc.close();
	}
}
