package codeForces;
import java.util.*;

public class Decoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
		if(n%2==0) {
			char st [] = s.toCharArray();
			char c [] = new char [n];
			int r = 1, l =n-2;
			for(int i = 0;i<=n/2-1 && l>=0;i++) {
				c [i] = st [l];
				l -= 2;
			}
			for(int i = n/2;i<n && r<n;i++) {
				c [i] = st [r];
				r += 2;
			}
			String str = "";
			for(int i = 0;i<n;i++) {
				str += c [i];
			}
			System.out.println(str);
		}
		else {
			char st [] = s.toCharArray();
			char c [] = new char [n];
			
			int r = 0, l = n-2;
			for(int i = 0;i<n/2 && l>=0;i++) {
				c [i] = st [l];
				l -= 2;
			}
			for(int i = n/2;i<n && r<n;i++) {
				c [i] = st [r];
				r += 2;
			}
			
			String str = "";
			for(int i = 0;i<n;i++) {
				str += c [i];
			}
			System.out.println(str);
		}
	}

}
