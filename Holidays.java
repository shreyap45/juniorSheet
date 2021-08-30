package codeForces;
import java.util.*;

public class Holidays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n/7;
		if(n%7==0) {
			System.out.println(temp*2+" "+temp*2);
		}
		else {
			if(n%7==1)
				System.out.println(temp*2+" "+(temp*2+1));
			else {
				if(n%7==6) System.out.println((temp*2+1)+" "+(temp*2+2));
				else System.out.println(temp*2+" "+(temp*2+2));
			}
        }
	}

}
