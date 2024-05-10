package Round944_div4_C;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt(),d = sc.nextInt();
			if(b<a) {
				int tt = b;
				b = a;
				a = tt;
			}
			if(d<c) {
				int tt = c;
				c = d;
				d = tt;
			}
			if(b==12) {
				if(c<a&&d>a)System.out.println("YES");
				else System.out.println("NO");
			}else if(d>b) {
				if(a>0) {
					if(b>c&&c>a)System.out.println("YES");
					else System.out.println("NO");
				}else {
					 if(b>c)System.out.println("YES");
					 else System.out.println("NO");
				}
			}else if(d>a){
				if(b<12) {
					if(b>d&&d>a&&c<a)System.out.println("YES");
					else System.out.println("NO");
				}else {
					if(c<a&&c>b)System.out.println("YES");
					else System.out.println("NO");
				}
				
			}else {
				System.out.println("NO");
			}
			
		}
		sc.close();
	}
}
