package codechef_lib;

import java.util.Scanner;

public class WATERFLOW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=1;i<=t;i++) {
			int w = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			if(w+(y*z)>x) {
				System.out.println("overflow");
			}else if(w+(y*z)==x) {
				System.out.println("filled");
			}else {
				System.out.println("unfilled");
			}
		}

	}

}
//Accepted