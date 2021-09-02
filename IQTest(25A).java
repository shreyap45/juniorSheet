import java.util.*;

public class Problem25A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a [] = new int [n];
		int eve =0, odd =0;
		for(int i =0;i<n;i++) {
			a [i] = sc.nextInt();
			if(a[i]%2==0) eve++;
			else odd++;
		}
		int ans = -1;
		if(odd==1) {
			for(int i =0;i<n;i++) {
				if(a [i]%2!=0) {
					ans = i+1;
					break;
				}
			}
		}
		else if(eve ==1){
			for(int i =0;i<n;i++) {
				if(a [i]%2==0) {
					ans = i+1;
					break;
				}
			}
		}
		System.out.println(ans);
	}

}
