package greety04;


import java.util.*;

public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int s = sc.nextInt(),t = sc.nextInt();
			int n = sc.nextInt();
			int[][] a = new int[n][2];
			for(int i = 0;i<n;i++) {
				a[i][0] = sc.nextInt();
				a[i][1] = sc.nextInt();
			}
			Arrays.sort(a,new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[0] - o2[0];
				}
			});
			long ans = 0;
			boolean flag = false;
			for(int i = 0;i<n;i++) {
				int tt = i,r = Integer.MIN_VALUE;
				while(tt<n&&s>=a[tt][0]) {
					r = Math.max(r, a[tt][1]);
					tt++;
				}
				if(r<s) break;
				ans++;
				if(r>=t) {
					flag = true;
					break;
				}
				s = r;
				i = tt - 1;
			}
			if(flag)System.out.println(ans);
			else System.out.println(-1);
			sc.close();
	}
}
