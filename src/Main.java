import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     char[] c = sc.next().toCharArray();
     int cnt = 0,ans = 0;
     for(char cc:c) {
    	 if(cc=='0') {
    		 ans += cnt + 1;
    		 
    	 }else if(((cc-'0')&1)==1) {
    		 
    	 }else {
    		 
    	 }
     }
     sc.close();
    }
    
}
