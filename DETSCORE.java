package codechef_lib;

import java.util.Scanner;

public class DETSCORE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=1;i<=t;i++) {
			int x = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(n*x/10);
		}

	}

}
//AC