package Knapsack01_opt;

import java.util.Scanner;

public class Main {
	//01背包优化
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), V = sc.nextInt();
		int[][] a = new int[N + 1][2];
		int[] dp = new int[V + 1];
		for (int i = 1; i < N+1; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		//状态转移 dp[i-1][j-v[i]] --> dp[i][j]
		for (int i = 1; i < N+1; i++) {
			for (int j = V; j >= 1; j--) {
				if(j>=a[i][0]) dp[j] = Math.max(dp[j-a[i][0]] + a[i][1], dp[j]); 
			}
		}
		System.out.println(dp[V]);
		sc.close();
	}
}
