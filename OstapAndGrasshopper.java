package codeForces;
import java.util.*;

public class OstapAndGrasshopper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		int g = -1, t=-1;
		for(int i =0;i<n;i++) {
			if(s.charAt(i) == 'G') g = i;
			if(s.charAt(i) == 'T') t = i;
		}
		
		int temp = Math.abs(g-t);
		boolean d = true;
		
		if(g>t) {
			int i = g;
			if(temp%k!=0) d = false;
			else {
				while(i>=0 && i>=t) {
					if(s.charAt(i-k) == '#') {
						d = false;
						break;
					}
					if(s.charAt(i-k) == 'T') {
						d= true;
						break;
					}
					i-=k;
				}
			}
		}
		else {
			int i = g;
			if(temp%k!=0) d = false;
			else {
				while(i<n && i<=t) {
					if(s.charAt(i+k) == '#') {
						d = false;
						break;
					}
					if(s.charAt(i+k) == 'T') {
						d= true;
						break;
					}
					i+=k;
				}
			}
		}
		if(d) System.out.println("YES");
		else System.out.println("NO");
	
	}

}
