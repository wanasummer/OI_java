package newbie98_C;

import java.util.Scanner;

public class Main {
	static int mod = 998244353;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		while(q-->0) {
			long a = sc.nextLong(),x = sc.nextLong();
			if(x==1) {
				System.out.println(a%mod);
			}else {
				long ans = ((((x*(x-1)/2)%mod*a)%mod)*a)%mod;
				System.out.println(ans);
			}
		}
		sc.close();
	}
}

