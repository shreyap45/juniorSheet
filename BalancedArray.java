import java.util.*;

public class BalancedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			if(n%4!=0) System.out.println("NO");
			else {
				int a [] = new int [n];
				int j = 2, sume =0;
				for(int i =0;i<n/2;i++) {
					a [i] = j;
					j += 2;
					sume += a [i];
				}
				
				int k = 1;
				for(int i = n/2;i<n;i++) {
					if(i == n-1) a [n-1] = sume;
					else a [i] = k;
					sume -= k;
					k += 2;
				}
				System.out.println("YES");
				for(int each : a)
					System.out.print(each+" ");
			}
			
		}
	}

}
