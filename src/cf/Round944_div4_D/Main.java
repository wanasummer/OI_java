package Round944_div4_D;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String s = sc.next();
			char[] c = s.toCharArray();
			int[] cor = findLongest(c);
			for(int i = 0;i<c.length;i++) {
				if(i==cor[0]||i==cor[1])continue;
				
			}
		}
		sc.close();
	}
	static int[] findLongest(char[] c) {
		int max = 0;
		int[] cor = new int[2];
		int l = 0,r = 0;
		boolean hasOne = false;
		for(;r<c.length;r++) {
			if(c[r]=='1') {
				hasOne = true;
			}
			if(hasOne&&c[r]=='0') {
				if(r-l>max) {
					max = r-l;
					cor[0] = l;cor[1] = r;
					l = r;
				}
				hasOne = false;
			}
		}
		if(hasOne) {
			if(r-l>max) {
				max = r-l;
				cor[0] = l;cor[1] = r;
				l = r;
			}
		}
		return cor;
	}
}
