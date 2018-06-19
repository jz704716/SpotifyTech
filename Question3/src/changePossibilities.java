public class changePossibilities {

	public static void main(String[] args) {
	int amount = 4;
	int [] coins = {1, 2, 3};

	System.out.print(change(amount, coins));
		
	}

	public static int change(int amount, int[] coins) {
		int [] result = new int[amount + 1];
		int i = 0;
		result[0] = 1;
		for(int coin : coins)
			for(i = 1; i < result.length; i++)
				if(i >= coin) {
					result[i] = result[i] + result[i -coin];
					
				}
		
			return result[amount];
	}
}
