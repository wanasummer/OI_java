package Round944_div4_D;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String s = sc.next();
			int ZO = 0;
			int res = 1;
			for(int i = 1;i<s.length();i++) {
				if(s.charAt(i)!=s.charAt(i-1))res++;
				if(s.charAt(i)=='1'&&s.charAt(i-1)=='0')ZO = 1;
			}
			System.out.println(res-ZO);
		}
		sc.close();
	}
	
}
