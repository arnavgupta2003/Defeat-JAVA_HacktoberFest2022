package codechef_lib;

import java.util.ArrayList;
import java.util.Scanner;

public class WGHTS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		while(cases--!=0) {
			int w= sc.nextInt();
			int x= sc.nextInt();
			int y= sc.nextInt();
			int z= sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			arr.add(x);
			arr.add(y);
			arr.add(z);
			arr.add(x+y);
			arr.add(x+z);
			arr.add(y+z);
			arr.add(x+y+z);
			if(arr.contains(w)){
			    System.out.println("YES");
			}else{
			    System.out.println("NO");
			}
		}

	}

}
//AC