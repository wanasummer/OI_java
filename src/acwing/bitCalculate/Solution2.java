package bitCalculate;

import java.util.Scanner;
//lowBit Solution
public class Solution2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++)a[i] = sc.nextInt();
		for(int i = 0;i<n;i++) {
			int t = a[i];
			int res = 0;
			while(t>0) {
				t -= lowBit(t);
				res++;
			}
			System.out.print(res+" ");
		}
		sc.close();
	}
	
	public static int lowBit(int x) {
		return x&(-x);
	}
}
