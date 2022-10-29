public class BeerCounter {
	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";

		while(beerNum > 0) {
			if (beerNum == 1) {
				word = "bottle";
			}

			System.out.println(beerNum + " " + word + " of beer in the fridge.");
			System.out.println("Take one out and pass it around.");
			beerNum =  beerNum - 1;
		}

		System.out.println("We're out of beer...");
	}
}