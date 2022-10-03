package codechef_lib;

import java.util.Scanner;

public class ZOOZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=1;i<=t;i++) {
			int n = sc.nextInt();
			if(n==3) {
				System.out.println("010");
			}else {
				String zer="";
				for(int j=0;j<n-4;j++) {
					zer+="0";
				}
				System.out.println("10"+zer+"01");
			}
		}

	}

}
//AC