package Round948_div2_A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt()-1,m = sc.nextInt()-1;
			if(n<m)System.out.println("NO");
			else if((n-m)%2==0){
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
