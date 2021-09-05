import java.util.*;

public class Problem1409A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int res = Math.abs(a-b);
			res = (res+9)/10;
			System.out.println(res);
		}
	}

}
