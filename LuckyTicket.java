package codeForces;
import java.util.*;

public class LuckyTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int sum1 =0, sum2=0;
		boolean t = true;
		for(int i=0;i<n/2;i++) {
			if(s.charAt(i)=='4' || s.charAt(i) == '7') 
				sum1 += ((int)s.charAt(i)-48);
			else t = false;
		}
		
		for(int i = n/2;i<n;i++) {
			if(s.charAt(i)=='4' || s.charAt(i) == '7')
				sum2 += ((int)s.charAt(i)-48);
			else t = false;
		}
//		System.out.println(sum1+" "+sum2);
		if(sum1==sum2 && t) System.out.println("YES");
		else System.out.println("NO");

	}
}
