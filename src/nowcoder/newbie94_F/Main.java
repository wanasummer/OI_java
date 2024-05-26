package newbie94_F;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int[] v = new int[n + 1], w = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		int ans = 0;
		for (int bit = 30; bit >= 0; bit--) {
			int guess = ans | (1 << bit);
			int weight = (1<<30) - 1;
			for(int i = 1;i<=n;i++) {
				if((guess&v[i])==guess)weight&=w[i];
			}
			if(weight<=k)ans = guess;
		}
		System.out.println(ans);

		sc.close();
	}
}
 