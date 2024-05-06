package presum_matrix;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(),q = sc.nextInt();
		int[][] matrix = new int[n+1][m+1];
		for(int i = 1;i<n+1;i++) {
			for(int j = 1;j<m+1;j++) {
				matrix[i][j] = sc.nextInt();
				matrix[i][j] += matrix[i][j-1];
			}
		}
		for(int j = 1;j<m+1;j++) {
			for(int i = 1;i<n+1;i++)matrix[i][j] += matrix[i-1][j];
		}
		while(m-->0) {
			int x1 = sc.nextInt(),y1 = sc.nextInt(),x2 = sc.nextInt(),y2 = sc.nextInt();
			int s = matrix[x2][y2] - matrix[x1-1][y2] - matrix[x2][y1-1] + matrix[x1-1][y1-1];
			System.out.println(s);
		}
		sc.close();
	}
}
