package Knapsack02;

import java.util.Scanner;
//多重背包问题
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),V = sc.nextInt();
		int[] dp = new int[V+1];
		int[] v = new int[N+1], w = new int[N+1],s = new int[N+1];
		for(int i = 1;i<=N;i++) {
			v[i] = sc.nextInt();w[i] = sc.nextInt();s[i] = sc.nextInt();
		}
		for(int i = 1;i<=N;i++) {
			for(int j = V;j>=1;j--) {
				for(int k =  Math.min(s[i], j / v[i]);k>=1;k--) {
					dp[j] = Math.max(dp[j-k*v[i]]+k*w[i], dp[j]);
				}
			}
		}
		System.out.println(dp[V]);
		sc.close();
	}
}
