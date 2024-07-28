package newbie15_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//QLQ|QLQ  LQQQ|LQQQ  LQLQ|LQLQ QQLQ|QQLQ
		//101 201  0123 0123  0101 0101 1201 2301 
		//因为是一个环形结构，
		//可以发现n为一个周期，走到第二个周期的时候可能取得最大值,也可能去到的值和第一次一样大，
		//所以每次取第二个周期即可，每个字母下的数字对应当前位置的猴子所获得的桃子数量，
		//由于每个路上都有猴子，所以最后的结果把每个猴子手中的桃子数量加起来即可。
		//涉及到周期(循环节)，第二个周期对应的字母可以通过模运算来取到
		int n = sc.nextInt();
		String s = sc.next();
		long[] a = new long[2*n];
		if(s.charAt(0)=='Q')a[0] = 1;
		else a[0] = 0;
		for(int i = 1;i<a.length;i++) {
			int curCharIndex = i % n;
			if(s.charAt(curCharIndex)=='Q')a[i] = a[i-1] + 1;
			else a[i] = 0;
		} 
		long ans = 0;
		for(int i = n;i<a.length;i++)ans += a[i];
		System.out.println(ans);
		sc.close();
	}
}
