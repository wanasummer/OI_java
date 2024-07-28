package weekly52_A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1|n==2) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
			System.out.println(1+" "+(n-1));
		}
		sc.close();
	}
}


