package codeForces;
import java.util.*;

public class Reconnaissance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a [] = new int [n];
		for(int i =0;i<n;i++) a[i] = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int ind1 = -1, ind2 = -1;
		for(int i = 0;i<n-1;i++) {
			if(Math.abs(a[i]-a[i+1]) <min) {
				min = Math.abs(a[i]-a[i+1]);
				ind1 = i+1; ind2 = i+2;
			}
		}
		if(Math.abs(a[n-1]-a[0])<min) {
			min = Math.abs(a[n-1]-a[0]);
			ind1 = 1; ind2 = n;
		}
//		System.out.println(min);
		System.out.println(ind1+" "+ind2);

	}

}
