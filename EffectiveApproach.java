import java.util.*;

public class EffectiveApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i =0;i<n;i++) {
			map.put(sc.nextInt(), i);
		}
		
		int m = sc.nextInt();
		long vasya = 0, petya=0;
		int q [] = new int [m];
		for(int i =0;i<m;i++) {
			q [i] = sc.nextInt();
		}
		
		for(int i =0;i<m;i++) {
			if(map.containsKey(q[i])) {
				int temp = map.get(q[i]);
				vasya += temp+1;
				petya += map.size() - temp;
			}
		}
		
		System.out.println(vasya+" "+petya);
	}

}
