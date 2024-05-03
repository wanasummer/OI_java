package bitCalculate;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++)a[i] = sc.nextInt();
		for(int i = 0;i<n;i++) {
			int cnt = 0;
			int t = a[i];
			while(t>0) {
				cnt += t&1;
				t>>=1;
			}
			System.out.print(cnt+" ");
		}
		
		sc.close();
	}
}
