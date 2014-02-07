public class CouponCollector{
	public static void main(String [] args){
		int N = Integer.parseInt(args[0]); // > give # of cards java CouponCollector 4
		int cardCnt = 0;	// number of cards collected
		int valCnt = 0;		// number of distinct cards

		// do simulation
		boolean [] found = new boolean[N];
		while (valCnt < N){
			int val = (int) (Math.random() * N);
			cardCnt++;
			if (!found[val]) {
				valCnt++;
				found[val] = true;
			}
		}

		System.out.println(cardCnt);
	}
}