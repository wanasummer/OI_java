package newbie11_E;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c1 = sc.next().toCharArray();
		char[] c2 = Arrays.copyOf(c1,c1.length);
		Arrays.sort(c1,new Comparator<char>().reversed());
		sc.close();
	}
}
