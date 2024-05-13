package weekly42_E_B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	//正解组合数学+贡献法/dp
	static int mod = (int)(1e9+7);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),k = sc.nextInt();
		String s = sc.next();
		//预处理组合数
		long[][] C = new long[1010][1010];
		for(int i = 0;i<=1000;i++) {
			for(int j = 0;j<=i;j++) {
				if(j==0||j==i)C[i][j] = 1;
				else C[i][j] = (C[i-1][j-1] + C[i-1][j])%mod; 
			}
		}
		//处理pow10,10次方数组
		long[] pow10 = new long[1005];
		pow10[0] = 1;
		for(int i = 1;i<=1000;i++)pow10[i] = pow10[i-1]*10%mod;
		//求贡献
		long ans = 0;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<k;j++) {
				ans += (ans%mod + pow10[k-j-1]*(s.charAt(i)-'0')%mod*C[i][j]%mod*C[n-i-1][k-j-1]%mod)%mod;
			}
		}
		System.out.println(ans);
		sc.close();
	}
	
}
