package doubluePointer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++)a[i] = sc.nextInt();
		int l = 0,r = 0;
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		int ans = 0;
		for(;r<n;r++) {
			map.put(a[r],map.getOrDefault(a[r], 0)+1);
			while(map.get(a[r])>1&&l<=r) {
				map.put(a[l], map.get(a[l])-1);
				l++;
			}
			ans = Math.max(ans, r-l+1);
		}
		System.out.println(ans);
		sc.close(); 
	}
}
