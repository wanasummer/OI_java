package Round945_div2_B;

import java.util.Scanner;

//贪心 计算比特位为0的最长区间，如果全为0特判为1
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0;i<n;i++)a[i] = sc.nextInt();
			int res = 1;
			for(int i = 0;i<20;i++) {
				int len = 0,mx = 1;
				for(int j = 0;j<a.length;j++) {
					if(((a[j]>>i)&1)>0) {
						mx = Math.max(mx, len+1);
						len = 0;
					}else {
						len++;
					}
				}
				mx = Math.max(mx, len+1);
				if(mx==n+1)continue;
				res = Math.max(mx, res);
			}
			System.out.println(res);
		}
		sc.close();
	}
}
