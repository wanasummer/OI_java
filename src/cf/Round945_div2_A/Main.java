package Round945_div2_A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
			if((a+b+c)%2==0) {
				System.out.println(Math.min(a+b, (a+b+c)/2));
			}else System.out.println(-1);
		}
		sc.close();
	}
	
}
