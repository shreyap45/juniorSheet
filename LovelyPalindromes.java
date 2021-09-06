import java.util.*;

public class LovelyPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder res = new StringBuilder(s);
		for(int i =s.length()-1;i>=0;i--){
			res.append(s.charAt(i));
		}
		System.out.println(res);

	}

}
