package newbie93_B;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	static BigInteger mod = new BigInteger("998244353");
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = sc.next(),b = sc.next();
		char[] ac = a.toCharArray(), bc = b.toCharArray();
		for(int i = 0;i<n;i++) {
			BigInteger bigA = new BigInteger(String.valueOf(ac)),bigB = new BigInteger(String.valueOf(bc));
			BigInteger sA = new BigInteger(ac[i]+""),sB = new BigInteger(bc[i]+"");
			BigInteger ans1 = bigA.multiply(bigB);
			swap(ac,bc,i);
			bigA = new BigInteger(String.valueOf(ac));bigB = new BigInteger(String.valueOf(bc));
			BigInteger ans2 = bigB.multiply(bigB);
			if(ans2.compareTo(ans1)==1) {
				System.out.println(String.valueOf(ac));
				System.out.println(String.valueOf(bc));
				swap(ac,bc,i);
			}
		}
		//System.out.println(String.valueOf(ac));
		//System.out.println(String.valueOf(bc));
		BigInteger aa = new BigInteger(String.valueOf(ac)),bb = new BigInteger(String.valueOf(bc));
		System.out.println(aa.multiply(bb).mod(mod));
		sc.close();
	}
	
	static void swap(char[] ac,char[] bc,int i) {
		char t = ac[i];
		ac[i] = bc[i];
		bc[i] = t;
	}
}
