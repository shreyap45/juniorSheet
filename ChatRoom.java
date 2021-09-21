package codeForces;
import java.util.*;

public class ChatRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean t [] = new boolean [5];
		int j = 0;
		Arrays.fill(t, false);
		if(s.length()<5) System.out.println("NO");
		else {
			for(int i =0;i<s.length();i++) {
				if(s.charAt(i) == 'h' && j==0) {
					t [j] = true;
					j++;
				}
				else if(s.charAt(i) == 'e' && j==1) {
					t [j] = true;
					j++;
				}
				else if(s.charAt(i) == 'l' && j==2) {
					t [j] = true;
					j++;
				}
				else if(s.charAt(i) == 'l' && j==3) {
					t [j] = true;
					j++;
				}
				else if(s.charAt(i) == 'o' && j==4) {
					t [j] = true;
					j++;
				}
			}
			if(t[4] == true) System.out.println("YES");
			else System.out.println("NO");
		}
		
	}

}
