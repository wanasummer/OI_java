package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class prime {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StreamTokenizer st = new StreamTokenizer(br);
	static PrintWriter pw = new PrintWriter(System.out);
	static int nextInt() throws IOException {
		st.nextToken();
		return (int) st.nval;
	}

	public static void main(String[] args) throws IOException {
		int n = nextInt();
		int[] arr = new int[n];
		// key 质因数 value 下标
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int l = Integer.MAX_VALUE,r = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			arr[i] = nextInt();
			List<Integer> list = new ArrayList<>();
			for(int m = 2;m<=arr[i]/m;m++) {
				if(arr[i]%m==0) {
					while(arr[i]%m==0) {
						arr[i]/=m;
					}
					if(!map.containsKey(m)) {
						map.put(m,i);
					}else {
						map.put(m, Math.min(map.get(m),i));
						list.add(m);
					}
				}
			}
			if(arr[i]>1) {
				if(!map.containsKey(arr[i])) {
					map.put(arr[i],i);
				}else {
					map.put(arr[i], Math.min(map.get(arr[i]),i));
					list.add(arr[i]);
				}
			}
			if(!list.isEmpty()) {
				for(int x:list) {
					int value = map.get(x);
					if(value<l) {
						l = value;
						r = i;
					}
				}
			}
		}
		pw.print((l+1)+" "+(r+1));
		pw.flush();
	}
}