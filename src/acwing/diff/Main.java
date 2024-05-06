package diff;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),m = sc.nextInt();
		int[] a = new int[n+2];
		for(int i = 1;i<n+1;i++)a[i] = sc.nextInt();
		for(int i = n;i>=1;i--)a[i] -= a[i-1];
		for(int i = 0;i<m;i++) {
			int l = sc.nextInt(),r = sc.nextInt(),c = sc.nextInt();
			a[l]+=c;
			a[r+1]-=c;
		}
		for(int i = 1;i<n+1;i++)a[i] += a[i-1];
		for(int i = 1;i<n+1;i++)System.out.print(a[i]+" ");
		sc.close();
	}
}
