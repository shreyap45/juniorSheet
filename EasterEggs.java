import java.util.*;

public class EasterEggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = "ROYGBIV";
		int num = n%7;
		
		String t = s.repeat(n/7);
		if(num==0) {
			t = s.repeat(n/7) ;
		}
		else if(num>3) {
			t += s.substring(0,num);
		}
		else {
			String tr = "GBI";
			t += tr.substring(0, num);
		}
		System.out.println(t);
	}

}
