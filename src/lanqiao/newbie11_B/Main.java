package newbie11_B;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int mod = 998244353;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++)a[i] = sc.nextInt();
		Arrays.sort(a);
		long ans = 0;
		for(int i = 0;i<a.length;i++) {
			ans = (ans*10%mod+a[i])%mod;
		}
		System.out.println(ans);
		sc.close();
	}
}
