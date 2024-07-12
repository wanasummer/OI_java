package newbie98_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1) {
			System.out.println(1);
		}else {
			int even = 0, odd = 0;
			for(int i = 0;i<n;i++) {
				int t = sc.nextInt();
				if(t%2==0)even++;
				else odd++;
			}
			if(odd==even) {
				System.out.println(0);
			}else if(odd>even){
				System.out.println((odd-even)%2==0?0:1);
			}else {
				System.out.println(odd-even);
			}
		}
		sc.close();
	}
}
