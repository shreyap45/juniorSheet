import java.util.*;

public class ValeraAndPlates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int bowl = sc.nextInt();
		int plate = sc.nextInt();
		int a [] = new int [n];
		
		for(int i =0;i<n;i++) {
			a [i] = sc.nextInt();
			if(a[i] == 1) bowl--;
			else plate--;
		}
		int res=0;
		if(bowl>=0 && plate >=0) res =0;
		else if(plate<0 && bowl >0) {
			res = (plate+bowl);
			if(res>0) res =0;
			else res = Math.abs(plate+bowl);
		}
		else if(bowl<0 && plate >0) res = Math.abs(bowl);
		else {
			res = Math.abs(plate+bowl);
		}
		System.out.println(res);
		

	}

}
