public class Problem002 {

	public static int compute(int max){
		int ans = 0;
		for(int prev=1, actual=2; actual<max; actual+=prev, prev=actual-prev){
			if(actual % 2 == 0) ans += actual;
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println("Answer is " + Problem002.compute(4000000));
	}

}