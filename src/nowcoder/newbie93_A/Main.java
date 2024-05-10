package newbie93_A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt(),a = sc.nextInt(),k = sc.nextInt();
			int now = a+1;
			for(int i = 0;i<k;i++) {
				if(check(now))System.out.print("p"+" ");
				else System.out.print(now+" ");
				now+=n;
			}
			System.out.println();
			
		}
		sc.close();
	}
	static boolean check(int num) {
		if(num%7==0)return true;
		while(num>0) {
			if(num%10==7)return true;
			num/=10;
		}
		return false;
	}
}
