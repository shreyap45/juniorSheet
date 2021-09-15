import java.util.*;
 
public class KefaAndFirstStep {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a [] = new int [n];
		for(int i = 0;i<n;i++) a[i] = sc.nextInt();
		if(n==1) System.out.println("1");
		else {
			int c=1, res =0;
			for(int i =0;i<n-1;i++) {
				if(a[i] <= a[i+1]) {
					c++;
					res = Math.max(res, c);
				}
				else {
					res = Math.max(res, c);
					c=1;
				}
			}
			System.out.println(res);
		}
	}
 
}
