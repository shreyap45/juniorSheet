import java.util.*;

public class BalancedSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			String s = sc.next();
			if(n==1)System.out.println("-1 -1");
			else {
				boolean st = true;
				for(int i =0;i<n-1;i++) {
					if((s.charAt(i) == 'a' && s.charAt(i+1) == 'b') || (s.charAt(i) == 'b' && s.charAt(i+1) == 'a') ) {
						System.out.println((i+1) +" "+ (i+2));
						st = false;
						break;
					}
				}
				if(st) System.out.println("-1 -1");
			}
		}

	}

}
