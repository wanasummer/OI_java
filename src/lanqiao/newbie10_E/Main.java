package newbie10_E;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++)a[i] = sc.nextInt();
		Arrays.sort(a);
		long ans = 0;
		for(int i = n-1;i>=0;i--) {
			for(int j = i-1;j>=0;j--) {
				long t = fusion(a[i],a[j]);
				ans = Math.max(ans,t);
				if(ans-t>45)break;
			}
		}
		System.out.println(ans);
		sc.close();
	}
	
	static long fusion(int x,int y) {
		long res = x + y;
		while(x>0&&y>0) {
			int x1 = x % 10,y1 = y % 10;
			if(x1==y1) res -= x1;
			x/=10;y/=10;
		}
		return res;
	} 
}
