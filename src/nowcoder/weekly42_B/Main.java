package weekly42_B;

import java.util.Scanner;

public class Main {
	static int mod = (int)(1e9+7);
	static int p;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++)a[i] = sc.nextInt();
		char[] c = sc.next().toCharArray();
		long ans = 0;
		for(int i = 0;i<c.length;i++) {
			ans = (ans + move(c[i],a))%mod;
		}
		System.out.println(ans);
		sc.close();
	}
	static int move(char c,int[] a) {
		if(c=='L') {
			if(p==a.length-1)return a[p];
			else return a[--p];
		}else {
			if(p==a.length-1)return a[p];
			else return a[++p];
		}
	}
}
