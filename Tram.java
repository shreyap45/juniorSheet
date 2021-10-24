package codeForces;
import java.util.*;

public class Tram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int entr [] = new int [n];
		int exit [] = new int [n];
		for(int i =0;i<n;i++) {
			exit [i] = sc.nextInt();
			entr [i] = sc.nextInt();
		}
		int res = 0, res1=0;
		for(int i =0;i<n;i++) {
			res1 -= exit[i];
			res1 += entr[i];
			res = Math.max(res, res1);
		}
		System.out.println(res);

	}

}
