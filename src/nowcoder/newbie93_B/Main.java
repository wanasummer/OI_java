package newbie93_B;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	//$由于我们交换任意位置的数字a+b 的值恒为定值，只会改变 a-b，4ab = (a+b)^{2} - (a-b)^2于是我们最大化a−b 的值即可最小化 ab 的值。$
	static int mod = 998244353;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] a = sc.next().toCharArray(),b = sc.next().toCharArray();
		int[] A = new int[a.length],B = new int[b.length];
		for(int i = 0;i<a.length;i++)A[i] = a[i] - '0';
		for(int i = 0;i<b.length;i++)B[i] = b[i] - '0';
		long num = 0,ans = 0;
		for(int i = 0;i<n;i++) {
			if(A[i]<B[i]) {
				int t = A[i];
				A[i] = B[i];
				B[i] = t;
			}
			num = ((num*10)%mod+A[i])%mod;
		}
		for(int i = n-1;i>=0;i--) {
			ans = (ans + (B[i]*num)%mod)%mod;
			num = (num*10)%mod;
		}
		System.out.println(ans);
		sc.close();
	}
}
