package Round944_div4_C;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
			String s = "";
			for (int i = 1; i <= 12; i++) {
				if(a==i)s+="a";
				else if(b==i)s+="b";
				else if(c==i)s+="c";
				else if(d==i)s+="d";
			}
			char[] cc = s.toCharArray();
			if ((cc[1] == 'a' && cc[3] == 'b') || (cc[1] == 'b' && cc[3] == 'a'))
				System.out.println("YES");
			else if ((cc[1] == 'c' && cc[3] == 'd') || (cc[1] == 'd' && cc[3] == 'c'))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
}