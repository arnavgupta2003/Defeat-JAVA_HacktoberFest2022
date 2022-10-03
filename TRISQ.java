package codechef_lib;

import java.util.Scanner;

public class TRISQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=1;i<=t;i++) {
			int b = sc.nextInt();
			int m=0;
			while(b>2){
		        m+=(b-2)/2;
		        b=b-2;
		    }
			System.out.println(m);
			
		}
	}
	
}
