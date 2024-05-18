package newbie11_D;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt(),x = sc.nextInt(),y = sc.nextInt(),a = sc.nextInt(),b = sc.nextInt();
			if(x>b||y>n) {
				System.out.println(-1);
				continue;
			}
			long ans = 0;
			//最多买mx个
			int mx = n/y;
			//先装小桥
			int mcQ = b/x;
			if(mcQ>=mx) {
				System.out.println(mx);
				continue;
			}
			mx -= mcQ;
			ans += mcQ;
			//再装小蓝
			int mcL = a/x;
			if(mcL>=mx) {
				if(mx>=mcQ) {
					ans+=mcQ - 1;
				}else {
					ans+=mx;
				}
			}else {
				if(mcL>=mcQ) {
					ans+=mcQ - 1;
				}else {
					ans+=mcL;
				}
			}
			System.out.println(ans);
		}
		sc.close();
	}
}
