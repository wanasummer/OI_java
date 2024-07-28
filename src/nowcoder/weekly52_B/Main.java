package weekly52_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//贪心
		//不需要全部使用完，所以
		//令z为所需b方块的最少个数，
		//b方块一定是成对出现，出现奇数个无论怎么都无法填满，所以如果b方块的个数是奇数，
		//那实际用到最多b方块数量为min(b-1,z),偶数则全可用上,实际用到最多b方块数量为min(b,z)
		//最后，计算使用最多b方块加上使用最多a方块的面积是否大于匣子的面积即可
		int T = sc.nextInt();
		while(T-->0) {
			int a = sc.nextInt(),b = sc.nextInt(), n = sc.nextInt();
			int z = n/3*2;
			boolean check = false;
			if(b%2==0) {
				check = a*2+Math.min(b, z)*3>=n*2;
			}else {
				check = a*2+Math.min(b-1, z)*3>=n*2;
			}
			System.out.println(check?"YES":"NO");
		}
		sc.close();
	}
}
