package greety05;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i = 0;i<n;i++) {
			pq.add(sc.nextInt());
		}
		long ans = 0;
		while(pq.size()>1) {
			int num = pq.poll()+pq.poll();
			ans += num;
			pq.add(num);
		}
		System.out.println(ans);
		sc.close();
	}
}
