package Round944_div4_A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int a = sc.nextInt(),b = sc.nextInt();
			if(a<b) System.out.print(a+" "+b);
			else System.out.print(b+" "+a);
			System.out.println();
		}
		sc.close();
	}
}
