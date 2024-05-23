package knapsack01;

import java.util.Scanner;
//01背包问题
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), V = sc.nextInt();
		int[][] a = new int[N + 1][2];
		int[][] dp = new int[N + 1][V + 1];
		for (int i = 1; i < N+1; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		//状态转移 dp[i-1][j-v[i]] --> dp[i][j]
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if(j<a[i][0]) {
					dp[i][j] = dp[i-1][j];
				}else {
					dp[i][j] = Math.max(dp[i-1][j-a[i][0]] + a[i][1], dp[i-1][j]); 
				}
			}
		}
		System.out.println(dp[N][V]);
		sc.close();
	}
}
