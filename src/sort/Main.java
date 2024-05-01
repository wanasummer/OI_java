package sort;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) arr[i] = sc.nextInt();
		merge_sort(0,n-1, arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

	static void insert_sort(int n,int[] arr) {
		for(int i = 0;i<n;i++) {
			int temp = arr[i],j = i - 1;
			for(;j>=0&&temp<arr[j];j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
	}
	
	static void select_sort(int n,int[] arr) {
		for(int i = 0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	static void bucket_sort(int n,int[] arr) {
		int big = 0,k = 0;
		for(int i = 0;i<n;i++) { 
			if(arr[i]>big) big = arr[i]; 
		}
		int[] bucket = new int[big+1];
		for(int i = 0;i<n;i++) { 
			bucket[arr[i]]++;
		}
		for(int i = 0;i<=big;i++) {
			if(bucket[i]>0) {
				for(int j = 0;j<bucket[i];j++) {
					arr[k++] = i;
				}
			}
		}
	}
	
	static void quick_sort(int l,int r,int[] arr) {
		if(l<r) {
			int i = l,j = r,x = arr[l];
			while(i<j) {
				while(i<j&&arr[j]>=x)j--;
				if(i<j)arr[i++] = arr[j];
				while(i<j&&arr[i]<x)i++;
				if(i<j)arr[j--] = arr[i];
			}
			arr[i] = x;
			quick_sort(l, i-1, arr);
			quick_sort(i+1, r, arr);
		}
	}
	
	static void merge_sort(int l,int r,int[] arr) {
		if(l==r) return;
		int mid = l+((r - l)>>1);
		merge_sort(l, mid, arr);
		merge_sort(mid+1, r , arr);
		int i = l,j = mid+1,k = 0;
		int[] b = new int[r-l+1];
		while(i<=mid&&j<=r) {
			if(arr[i]>arr[j]) b[k++] = arr[j++];
			else b[k++] = arr[i++];
		}
		while(i<=mid)b[k++] = arr[i++];
		while(j<=r)b[k++] = arr[j++];
		for(int m = l,n = 0;m<=r&&n<b.length;m++,n++)arr[m] = b[n];
	}
}