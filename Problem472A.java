import java.util.*;

public class LearnFromMaths {
	public static boolean isPrime(int n ) {
		boolean s = true;
		for(int i = 2;i*i<=n;i++) {
			if(n%i==0) {
				s= false;
				break;
			}
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int start = n-4;
		int end = n-start;
		while(start>end) {
			if(isPrime(start) || isPrime(end)) {
				start--;
				end++;
			}
			else if(!isPrime(start) && !isPrime(end)) {
				System.out.println(start+" "+end);
				break;
			}
		}
		

	}

}
