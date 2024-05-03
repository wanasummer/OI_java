package doublePointer3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),m = sc.nextInt();
		int[] a = new int[n], b= new int[m];
		for(int i = 0;i<n;i++)a[i] = sc.nextInt();
		for(int i = 0;i<m;i++)b[i] = sc.nextInt();
		int i = 0;
		for(int j = 0;j<b.length;j++) {
			if(i<a.length&&a[i]==b[j])i++;
		}
		if(i>=a.length)System.out.println("Yes");
		else System.out.println("No");
		sc.close();
	}
}
