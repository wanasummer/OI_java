package newbie94_E;

import java.util.Scanner;

/*与运算, 选的越多, 价值越低, 但总体积也越小越可行
现在需要找到最大价值, 设其为ans
∴ value[1] & value[2] & ... = ans
∴ ans & value[i] = ans (ans在任意一位的1, 每个value在对应位上都有)

假设ans = 10110
那么只要第1位、第3位、第4位都为1, 那么这个物品对于这个答案来说就是可选的
而体积是选的越多越可行, 所以可以枚举答案
然后按"ans & value[i] = ans"这个条件,选出所有物品
计算出这些物品的总体积, 如果满足容量k限制, 则找到一个可行解 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int[] v = new int[n+1], w = new int[n+1];
		for (int i = 1; i <= n; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		for (int guess = 2000; guess >= 1; guess--) {
			int weight = (1 << 20) - 1;
			for (int i = 1; i <= n; i++) {
				if ((v[i] & guess) == guess)
					weight &= w[i];
			}
			if (weight <= k) {
				System.out.println(guess);
				sc.close();
				return;
			}
		}
		System.out.println(0);

		sc.close();
	}
}
