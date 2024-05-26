package newbie94_D;

import java.util.Scanner;

//(1) 如果a[i - 1] > a[i]:  
//意味着a[i]是第一次出现, 那么数a[i]一定是没使用过的, 该位需要填a[i] 
//
//    证明:
//    a[i-1] = gcd(ans[1],...ans[i-1]) > a[i] = gcd(ans[1],...ans[i])
//    min(ans[1],...ans[i-1]) > min(ans[1],...ans[i])
//    min(ans[1],...ans[i-1]) > ans[i]
//    ∴ ans[1]~ans[i-1] 与 ans[i] 不相等, a[i]一定未使用
//    
//    填a[i]是否会导致无解:
//    例如: a[i-1] = 4, a[i] = 2, n≥6
//    显然6也可以填, 那么2可以填在哪
//    如果 a[i+1] = 2, 则2可以填在i+1位, 这样的话,2与6可以互换, 不影响正确性
//    如果 a[i+1] = 1, 则后面都是1, 可填数字是任意的, 2和6依旧可以互换
//    所以填a[i] 不会导致无解
//    
//(2) 如果a[i-1] = a[i]:
//那么需要找一个a[i]的未使用倍数
//
//填多少倍: 
//    与1的互换同理, 找一个最小的满足条件的倍数即可
//
//从哪开始找:
//    不能直接从a[i]开始查找, 数组a末尾有很长串的1, 会超时
//    ∵ a[i] = gcd(ans[1],...ans[i])
//    ∴ ans[i]是a[i]的倍数, ans[i-1]也是a[i]的倍数, 且 ans[i] > ans[i-1]
//    所以可以从ans[i-1]+a[i]开始查找
    
public class Main {
	static int n;
	static boolean[] vis;
	static int[] a, ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n+1];ans = new int[n+1];
		vis = new boolean[n+1];
		for(int i = 1;i<=n;i++) {
			a[i] = sc.nextInt();
			if(a[i-1]%a[i]!=0) {
				System.out.println(-1);
				return;
			}
		}
		for(int i = 1;i<=n;i++) {
			if(a[i-1]!=a[i]) {
				ans[i] = a[i];
			}else {
				ans[i] = find(i);
				if(ans[i]==0) {
					System.out.println(-1);
					return;
				}
			}
			vis[ans[i]] = true;
		}
		for(int i = 1;i<=n;i++)System.out.print(ans[i]+" "); 
		sc.close();
	}
	
	public static int find(int i) {
		for(int j = ans[i-1] + a[i];j<=n;j+=a[i]) {
			if(!vis[j]&&gcd(a[i-1],j)==a[i]) {
				return j;
			}
		}
		return 0;
	}
	
	static int gcd(int a,int b) {
		return b==0?a:gcd(b,a%b);
	}
}
