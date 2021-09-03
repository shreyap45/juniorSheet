package codeForces;
import java.util.*;

public class PresidentOffice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char ch = sc.next().charAt(0);
		char c [][] = new char [n][m];
		
		for(int i = 0;i<n;i++) {
			c[i] = sc.next().toCharArray();
		}
		Set<Character> desk = new HashSet<>();
		for(int i =0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if(c[i][j] == ch) {
					if(i>0 && c[i-1][j] != '.' && c[i-1][j] != ch) desk.add(c[i-1][j]);
					if(j>0 && c[i][j-1] != '.' && c[i][j-1] != ch) desk.add(c[i][j-1]);
					if(i<n-1 && c[i+1][j] != '.' && c[i+1][j] != ch) desk.add(c[i+1][j]);
					if(j<m-1 && c[i][j+1] != '.' && c[i][j+1] != ch) desk.add(c[i][j+1]);
				}
			}
		}
		
		System.out.println(desk.size());
		
	}

}
