// package codeForces;
import java.util.*;

public class MinimumDifficulty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a [] = new int [n];
		for(int i =0;i<n;i++) {
			a [i] = sc.nextInt();
		}
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<n-1;i++) {
			int max = Integer.MIN_VALUE;
			for(int j = 1;j<n-1;j++) {
				if(j==i) {
					max = Math.max(max, a[j+1]-a[j-1]);
				}
				else max = Math.max(max, a[j+1]-a[j]);
			}
			list.add(max);
		}
		Collections.sort(list);
		System.out.println(list.get(0));
		
	}

}
