package weekly42_E;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	//暴力减枝k-cnt+i<ci.length过不了
	static int mod = (int)(1e9+7);
	static List<Long> list = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),k = sc.nextInt();
		char[] c = sc.next().toCharArray();
		int[] ci = new int[n];
		for(int i = 0;i<n;i++)ci[i] = c[i]-'0';
		dfs(ci,0,-1,k,0);
		long ans = 0;
		for(long i:list) {
			//System.out.println(i);
			ans = (ans + i)%mod;
		}
		System.out.println(ans);
		sc.close();
	}
	public static void dfs(int[] ci,int cnt,int index,int k,long num) {
		if(cnt==k) {
			list.add(num);
			return;
		}
		for(int i = index;i+1<ci.length&&k-cnt+i<ci.length;i++) {
			dfs(ci,cnt+1,i+1,k,num*10+ci[i+1]);
		}
	}
}
