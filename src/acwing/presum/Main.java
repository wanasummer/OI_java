package presum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),m = sc.nextInt();
		int[] a = new int[n+1];
		for(int i = 1;i<n+1;i++)a[i] = sc.nextInt();
		for(int i = 1;i<a.length;i++)a[i] += a[i-1];
		while(m-->0) {
			int l = sc.nextInt(), r = sc.nextInt();
			System.out.println(a[r]-a[l-1]);
		}
		sc.close();
	}
}


