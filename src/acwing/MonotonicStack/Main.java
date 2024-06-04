package MonotonicStack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> st = new Stack<Integer>();
		st.add(-1);
		for(int i = 0;i<n;i++) {
			int num = sc.nextInt();
			while(st.peek()>=num) {
				st.pop();
			}
			System.out.print(st.peek()+" ");
			st.add(num);
		}
		sc.close();
	}
}
