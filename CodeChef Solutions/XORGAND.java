package codechef_lib;

import java.util.Scanner;

public class XORGAND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=1;i<=t;i++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int j=0;j<n;j++) {
				arr[j]=sc.nextInt();
			}
			int dir[][] = new int[n+1][33];
			for(int j=1;j<=n;j++) {
				int temp=arr[j-1];
				for(int k=0;k<33;k++) {
					dir[j][k]=dir[j-1][k];
				}
				int pow=32;
				if(temp!=0) {
					pow=(int)(Math.log(temp)/Math.log(2));
				}	
				rdir[j][pow]++;
				
			}
			int q=sc.nextInt();
			for(int j=0;j<q;j++) {
				int l  = sc.nextInt();int r=sc.nextInt();int x=sc.nextInt();
				int c=0;int pow=32;
				if(x!=0) {
					pow=(int)(Math.log(x)/Math.log(2));
				}	
				c=dir[r][pow]-dir[l-1][pow];
				int ans=r-l+1-c;
				System.out.println(ans);
				
				
			}
		}

	}

}
