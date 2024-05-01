package math;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		System.out.println(gcd(16, 12));
		System.out.println(lcm(16, 12));
		System.out.println(qsm2(4, 6));
	}

	static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	static int qsm(int x, int y) {
		if (y == 0)
			return 1;
		if ((y & 1) == 1)
			return x * qsm(x, y - 1);
		int t = qsm(x, y >> 1);
		return t * t;
	}

	static int qsm2(int x, int y) {
		int res = 1;
		while (y > 0) {
			if ((y & 1) == 1) {
				res *= x;
				y--;
			} 
				x *= x;
				y>>=1;
			}
		return res;
		}
}