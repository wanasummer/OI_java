package newbie98_A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),x = sc.nextInt();
		for(int i = 0;i<n;i++) {
			int t = sc.nextInt();
			if(t==x) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
		sc.close();
	}
}
