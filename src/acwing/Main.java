import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<Integer> exclude = new HashSet<Integer>(); 
		exclude.add(35);
		exclude.add(13);
		exclude.add(39);
		exclude.add(20);
		exclude.add(19);
		exclude.add(18);
		exclude.add(29);
		exclude.add(9);
		exclude.add(47);
		Set<Integer> set = new HashSet<Integer>();
		while(set.size()<10) {
	    	 int n = (int)Math.floor(Math.random()*50)+1;
	    	 if(!exclude.contains(n))set.add(n);
	     }
		for(int i:set)System.out.println(i);
	}
}
