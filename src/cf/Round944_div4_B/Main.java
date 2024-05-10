package Round944_div4_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		a:while(t-->0) {
			String s = sc.next();
			if(s.length()==1) {
				System.out.println("NO");
				continue;
			}
			char[] c = s.toCharArray();
			for(int i = 1;i<c.length;i++) {
				if(c[i-1]!=c[i]) {
					char tt = c[0];
					c[0] = c[i];
					c[i] = tt;
					System.out.println("YES");
					System.out.println(String.valueOf(c));
					continue a;
				}
			}
			System.out.println("NO");
		}
		sc.close();
	}
}
