package euler;

public class Problem001 {

	public static int compute (int max) {
		int ans = 0;
		for(int i=1; i < max; i++) {
			if(i%3 == 0 || i%5 == 0) ans += i;
		}
		return ans;
	}

	public static void main(String[] args){
		System.out.println("Answer is " + Problem001.compute(1000));
	}
}