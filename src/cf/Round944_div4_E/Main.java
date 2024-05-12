package Round944_div4_E;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt(),k = sc.nextInt(),q = sc.nextInt();
			int[] a = new int[k+1],b = new int[k+1];
			a[0] = 0;b[0] = 0;
			for(int i = 1;i<=k;i++) a[i] = sc.nextInt();
			for(int i = 1;i<=k;i++) b[i] = sc.nextInt();
			while(q-->0) {
				int dis_t = sc.nextInt();
				int t_index = findThead(dis_t, a);
				//System.out.println("dis_t"+dis_t);
				//System.out.println("at"+a[t_index]);
				if(a[t_index]==dis_t) {
					System.out.print(b[t_index]+" ");
					continue;
				}
				System.out.print(f(a[t_index+1],a[t_index],dis_t,b[t_index+1],b[t_index])+" ");
			}
			System.out.println();
		}
		sc.close();
	}
	
	static int findThead(int t,int[] a) {
		int l = 0,r = a.length-1;
		while(l<=r) {
			int mid = l+((r-l)>>1);
			if(a[mid]<=t)l = mid + 1;
			else r = mid - 1;
		}
		//for(int i = 0;i<a.length;i++)System.out.print("a"+a[i]);
		//System.out.println("r"+r);
		return r;
	}
	
	static int f(long dis_f,long dis_c,long dis_t,long time_f,long time_c) {
		return (int)(time_c + (dis_t-dis_c)*(time_f-time_c)/(dis_f-dis_c));
	}
}
