package weekly52_C;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//贪心
		//根据题意可以推断出负数可以和任意的数消掉，而正数只能和相同的数或者负数消掉
		//所以 可以先按照相同相消 消非负数，再消负数
		int n = sc.nextInt();
		int neg = 0;
		Map<Integer,Integer> non = new HashMap<Integer, Integer>();
		for(int i = 0;i<n;i++) {
			int num = sc.nextInt();
			if(num>=0) {
				if(!non.containsKey(num))non.put(num, 1);
				else non.put(num, non.get(num)+1);
			}else {
				neg++;
			}
		}
		int nonRemaind = 0;
		//相同相消
		for(Integer value : non.values()) {
			nonRemaind += value % 2;
		}
		
		int t = Math.min(nonRemaind, neg);
		neg -= t;
		nonRemaind -= t;
		neg %= 2;
		System.out.println(neg+nonRemaind);
		sc.close();
	}
}
