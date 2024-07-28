package newbie15_C;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//最后合成一粒仙丹，所以
		//1.如果最后的仙丹是>0的，他上一步一定加上一个负数，或者0
		//2.如果最后的仙丹是<0的，他上一步一定加上一个正数，或者0
		//所以 如果可以合成一粒，那么一定有 min<=sum<=max
		int n = sc.nextInt();
		int sum = 0,min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
		for(int i = 0;i<n;i++) {
			int num = sc.nextInt();
			sum += num;
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		System.out.println(sum>=min&&sum<=max ? 'Y' : 'N');
		sc.close();
	}
}
