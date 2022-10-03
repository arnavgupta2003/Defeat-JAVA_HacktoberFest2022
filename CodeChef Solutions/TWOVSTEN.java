package codechef_lib;

import java.util.Scanner;

public class TWOVSTEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=1;i<=t;i++) {
			int num = sc.nextInt();
			if(num%5==0) {
				if(num%10==0) {
					System.out.println("0");
				}else if((num*2)%10==0) {
					System.out.println("1");
				}
				
			}else if(num%5!=0) {
				System.out.println("-1");
			}
		}

	}

}
