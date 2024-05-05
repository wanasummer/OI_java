package discretization;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = sc.nextInt();
        List<Integer> all = new ArrayList<Integer>();
        int[][] add = new int[n][2];
        int[][] query = new int[m][2];
        for(int i = 0;i<n+m;i++) {
        	if(i<n) {
        		add[i][0] = sc.nextInt();add[i][1] = sc.nextInt();
        		all.add(add[i][0]);
        	}else {
        		int l = sc.nextInt(),r = sc.nextInt();
        		query[i-n][0] = l;query[i-n][1] = r;
        		all.add(l);all.add(r);
        	}
        }
        //排序，去重
        Collections.sort(all);
        for(int i = 1;i<all.size();i++) {
        	if(all.get(i)==all.get(i-1))all.remove(i-1);
        }
 
        int[] s = new int[all.size()],pre = new int[all.size()+1];
        for(int i = 0;i<n;i++) {
        	int index = find(all,add[i][0]);
//        	System.out.println("number"+add[i][0]);
//        	System.out.println("index"+index);
        	s[index] += add[i][1];
        }
        //前缀和
        for(int i = 1;i<pre.length;i++) {
        	pre[i] = pre[i-1] + s[i-1];
        }
        
        for(int i = 0;i<m;i++) {
        	int l = find(all,query[i][0]);
        	int r = find(all,query[i][1]);
        	System.out.println(pre[r+1]-pre[l]);
        }
        
        sc.close();
    }
    
    static int find(List<Integer> list,Integer target) {
    	int l = 0,r = list.size()-1;
    	while(l<=r) {
    		int mid = l+((r-l)>>1);
    		if(target<list.get(mid))r = mid - 1;
    		else l = mid + 1;
    	}
    	return r;
    }
}