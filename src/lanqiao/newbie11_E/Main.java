package newbie11_E;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		Arrays.sort(c);
		StringBuilder sb = new StringBuilder(new String(c)).reverse();
		if(c[0]=='0') {
			for(int i = 1;i<c.length;i++) {
				if(c[i]!='0') {
					char t = c[i];
					c[i] = c[0];
					c[0] = t;
					break;
				}
 			}
		}
		System.out.println(sb+" "+new String(c));
	}
}
