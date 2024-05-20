package newbie11_F;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(),time = Integer.MAX_VALUE;
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0;i<n;i++) {
			int num = sc.nextInt();
			int t = Math.min(i+1, n-i);
			map.put(num,Math.min(map.getOrDefault(num, t),t));
			if(map.containsKey(k-num)&&k-num!=num) time = Math.min(time, Math.max(map.get(k-num), t));
		}
		System.out.println(time==Integer.MAX_VALUE?-1:time);
		sc.close();
	}
}
