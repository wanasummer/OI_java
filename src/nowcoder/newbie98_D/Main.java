package newbie98_D;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),L = sc.nextInt(),R = sc.nextInt();
		String s = sc.next();
		int[] sum0 = new int[n+1],sum1 = new int[n+1];
		int[][] f = new int[n+1][n+1];
		for(int i = 1;i<=n;i++) {
			sum0[i] += sum0[i-1] + (s.charAt(i-1)=='0'?1:0);
			sum1[i] += sum1[i-1] + (s.charAt(i-1)=='0'?0:1);
		}
		for(int len = 2;len<=n;len++) {
			for(int l = 1;l+len-1<=n;l++) {
				int r = l+len-1;
				for(int k = l;k<r;k++) {
					int dif = Math.abs(sum1[r]-sum1[k]-sum0[k]+sum0[l-1]);
					if(dif>=L&&dif<=R) f[l][r] = Math.max(f[l][r],f[l][k]+f[k+1][r]+1);
				}
			}
		}
		System.out.println(f[1][n]);
		sc.close();
	}
}
