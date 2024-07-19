package IntervalDp;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+2]; 
		for(int i = 1;i<=n;i++)a[i] = sc.nextInt();
		int[] s = new int[n+2];
		for(int i = 1;i<=n;i++)s[i] = s[i-1]+a[i];
		int[][] f = new int[n+1][n+1];
		for(int i = 0;i<n+1;i++) Arrays.fill(f[i],Integer.MAX_VALUE);
		for(int i = 0;i<n+1;i++)f[i][i] = 0;
		for(int len = 2;len<=n;len++) {
			for(int l = 1;l+len-1<=n;l++) {
				int r = l+len-1;
				for(int k = l;k<r;k++) {
					f[l][r] = Math.min(f[l][k]+f[k+1][r]+s[r]-s[l-1],f[l][r]);
				}
			}
		}
		for(int i = 0;i<n+1;i++) {
			for(int j = 0;j<n+1;j++)
				System.out.print(f[i][j]+" ");
		System.out.println();
		}
			
		sc.close();
	}
}
