import java.util.*;

public class DominoDisaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			String st = sc.next();
			char s []= st.toCharArray();
			
			StringBuilder str = new StringBuilder();
			
			for(int i =0;i<n;i++) {
				if(s[i] == 'U') str.append('D');
				else if(s[i] == 'D') str.append('U');
				else str.append(s[i]);
			}
			System.out.println(str);
		}

	}

}
