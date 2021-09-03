import java.util.*;

public class Contest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int misha =0, vasya=0;
		
		misha = Math.max((3*a)/10, a - (a/250)*c);
		vasya = Math.max((3*b)/10, b - (b/250)*d);
		
		if(misha >vasya) System.out.println("Misha");
		else if(misha<vasya) System.out.println("Vasya");
		else System.out.println("Tie");
		

	}

}
