package codeForces;
import java.util.*;

public class NastiaAndNearlyGoodNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			
			long x =0, y =0, z= 0;
			boolean s = false;
			
			 if(b == 1) {
				s = false;
			}
			else if(b == 2) {
				s = true;
				x = a*3;
				y = a*1;
				z = a*4;
			}
			else if(b == 4) {
				s = true;
				x = a*1;
				y = a*3;
				z = a*b;
			}
			else {
				s = true;
				x = a*2;
				y = a*(b-2);
				z = a*b;
			}
			if(s) {
				System.out.println("YES");
				System.out.println(x+ " "+ y + " "+z);
			}
			else System.out.println("NO");
			
		}

	}

}
