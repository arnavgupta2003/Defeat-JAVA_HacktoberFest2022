package codechef_lib;

import java.util.Scanner;

public class TODOLIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=1;i<=t;i++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			int c=0;
			for(int j=0;j<n;j++) {
				arr[j]=sc.nextInt();
				if(arr[j]>=1000) {
					c++;
				}
			}
			System.out.println(c);
		}
	}

}
//AC