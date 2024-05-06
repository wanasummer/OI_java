package diff_matrix;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {
	static int[][] b;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),m = sc.nextInt(),q = sc.nextInt();
		int[][] matrix = new int[n+2][m+2];
		b = new int[n+2][m+2];
		for(int i = 1;i<n+1;i++) {
			for(int j = 1;j<m+1;j++) {
				matrix[i][j] = sc.nextInt();
				insert(i,j,i,j,matrix[i][j]);
			}
		}
		while(q-->0) {
			int x1 = sc.nextInt(),y1 = sc.nextInt(),x2 = sc.nextInt(),y2 = sc.nextInt(),c = sc.nextInt();
			insert(x1,y1,x2,y2,c);
		}
		for(int i = 1;i<n+1;i++) {
			for(int j = 1;j<m+1;j++) {
				b[i][j] += b[i][j-1];
			}
		}
		for(int j = 1;j<m+1;j++) {
			for(int i = 1;i<n+1;i++) {
				b[i][j] += b[i-1][j];
			}
		}
		for(int i = 1;i<n+1;i++) {
			for(int j = 1;j<m+1;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
	
	static void insert(int x1,int y1,int x2,int y2,int c) {
		b[x1][y1]+=c;
		b[x1][y2+1]-=c;
		b[x2+1][y1]-=c;
		b[x2+1][y2+1]+=c;
	}
}
