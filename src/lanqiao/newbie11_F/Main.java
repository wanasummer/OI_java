package newbie11_F;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),k = sc.nextInt();
		int[][] a = new int[n][2];
		for(int i = 0;i<n;i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = i;
		}
		Arrays.sort(a);
		ArrayList<Integer>
		int l = 0,r = n-1;
		while(a[r][0]>=k)r--;
		for(;l<r;r--) {
			long t = k - a[r][0];
			int ll = l,rr = r;
			while(ll<=rr) {
				int mid = ll+((rr-ll)>>1);
				if(a[mid][0]<t) l++;
				else r--;
			}
			if(a[l][0]==t) {
				map.put(a[l][1], a[r][1]);
			}
		}
		sc.close();
	}
}
