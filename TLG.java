package codechef_lib;

import java.util.Arrays;
import java.util.Scanner;

public class TLG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int winner[] =new int[t];
		int lead_arr[] = new int[t];
		for (int i=0;i<t;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a>b) {
				lead_arr[i] = a-b;
				winner[i] =1;
			}else if(b>a) {
				lead_arr[i] = b-a;
				winner[i] =2;
			}
		}
		int lead_arr_copy[] = new int[lead_arr.length];
		for (int y =0;y<lead_arr.length;y++){
		    lead_arr_copy[y] = lead_arr[y];
		}
        Arrays.sort(lead_arr_copy);
		int idx = 0;
		for (int q=0;q<lead_arr.length;q++) {
			if(lead_arr_copy[lead_arr_copy.length-1]==lead_arr[q]) {
				idx = q;
			}else {
				continue;
			}
		}
		System.out.println((winner[idx])+" "+(lead_arr[idx]));
		

	}

}
