package newbie10_C;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),p = sc.nextInt(),d = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++)a[i] = sc.nextInt();
        Arrays.sort(a,1,a.length);
        long ans = a[0];
        int i = 1 , j = a.length-1;
        while(d-->0&&i<a.length&&a[i]<=0) ans -= a[i++];
        while(p-->0&&j>=i&&a[j]>=0) ans += a[j--];
        while(j>=i&&d-->0){
          //System.out.println("d " + a[i]);
          ans -= a[i++];
        }
        while(j>=i&&p-->0) {
        	//System.out.println("p" + a[j]);
        	ans += a[j--];
        }
        System.out.println(ans);
        sc.close();
    }
}