package matrix;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	static int mod = 998244353;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StreamTokenizer st = new StreamTokenizer(br);

	static int nextInt() throws Exception {
		st.nextToken();
		return (int) st.nval;
	}
	static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception {
		int n = nextInt(),m = nextInt(),a = nextInt(),b = nextInt();
		long[][] arr = new long[n][m];
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				arr[i][j] = nextInt();
			}
		}
		long ans = 0;
		long[] maxArr = new long[n-a+1];
		long[] minArr = new long[n-a+1];
		long[][] MAX = new long[n][m-b+1];
		long[][] MIN = new long[n][m-b+1];
		for(int i = 0;i<n;i++) getMax(arr[i],MAX[i],b,new ArrayDeque());
		for(int i = 0;i<n;i++) getMin(arr[i],MIN[i],b,new ArrayDeque());
		long[] temp = new long[n];
		for(int j = 0;j<m-b+1;j++) {
			for(int i = 0;i<n;i++)temp[i] = MAX[i][j];
			getMax(temp,maxArr,a,new ArrayDeque());
			for(int i = 0;i<n;i++)temp[i] = MIN[i][j];
			getMin(temp,minArr,a,new ArrayDeque());
			for(int i=0;i<n-a+1;i++) {
				ans = (ans+(maxArr[i]*minArr[i])%mod)%mod;
			}
		}
		
		pw.println(ans);
		pw.flush();
	}
	
	static void getMax(long[] arr,long[] t,int k,Deque<Integer> dq) {
		int n = arr.length;
		for(int i = 0;i<n;i++) {
			while(!dq.isEmpty()&&arr[i]>=arr[dq.getLast()]) {
				dq.removeLast();
			}
			dq.addLast(i);
			if(i - dq.getFirst()>=k) dq.removeFirst();
			if(i>=k-1)t[i-k+1] = arr[dq.getFirst()]; 
		}
	}
	
	static void getMin(long[] arr,long[] t,int k,Deque<Integer> dq) {
		int n = arr.length;
		for(int i = 0;i<n;i++) {
			while(!dq.isEmpty()&&arr[i]<=arr[dq.getLast()]) {
				dq.removeLast();
			}
			dq.addLast(i);
			if(i-dq.getFirst()>=k)dq.removeFirst();
			if(i>=k-1) t[i-k+1] = arr[dq.getFirst()];
		}
	}

}
