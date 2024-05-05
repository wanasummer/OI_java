package newbie10_D;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = sc.nextInt();
        sc.nextLine();
        char[][] matrix = new char[n][m];
        for(int i = 0;i<n;i++){
          matrix[i] = sc.nextLine().toCharArray();
        }
        int ans = 0;
        for(int i = 0;i<n;i++){
          for(int j = 0;j<m;j++){
             int l = findL(matrix,i,j,0)-1,r = findR(matrix,i,j,0)-1;
             if(l==r)ans = Math.max(ans,l);
          }
        }
        System.out.print(ans);
        sc.close();
    }

    static int findL(char[][] matrix,int x,int y,int sideL){
        if(x<0||x>=matrix.length||y<0||y>=matrix[0].length||matrix[x][y]!='*')return sideL;
        return findL(matrix,x-1,y-1,sideL+1);
    }
    static int findR(char[][] matrix,int x,int y,int sideR){
        if(x<0||x>=matrix.length||y<0||y>=matrix[0].length||matrix[x][y]!='*')return sideR;
        return findR(matrix,x-1,y+1,sideR+1);
    }
}