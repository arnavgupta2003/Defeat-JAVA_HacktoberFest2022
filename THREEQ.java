package codechef_lib;

import java.util.Scanner;

public class THREEQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=1;i<=t;i++) {
			int sum_a =0;
			int sum_b=0;
			for(int r=0;r<3;r++) {
				int d = sc.nextInt();
				if(d==1) {
					sum_a++;
				}else {
					continue;
				}
			}
			for(int r=0;r<3;r++) {
				int d = sc.nextInt();
				if(d==1) {
					sum_b++;
				}else {
					continue;
				}
			}
			if(sum_a==sum_b) {
				System.out.println("Pass");
			}else {
				System.out.println("Fail");
			}
		}

	}

}
