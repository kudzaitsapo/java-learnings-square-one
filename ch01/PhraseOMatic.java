

public class PhraseOMatic {
	public static void main(String[] args) {
		
		// define the word lists
		String[] firstWords = { "24/7", "multi-tier", "30,000 square meters", "B-to-B", "front-end", "web-based", "smart", "six-sigma", "critical-path", "dynamic" };
		String[] secondWords = { "empowered", "sticky", "value-added", "oriented", "centric", "distributed", "branded", "leveraged", "cooperative", "networked" };
		String[] thirdWords = { "process", "solution", "architecture", "strategy", "portal", "space", "core-competency", "vision", "mindshare", "mission", "paradigm" };

		// find out the length of each word list
		int firstWordsLength = firstWords.length;
		int secondWordsLength = secondWords.length;
		int thirdWordsLength = thirdWords.length;

		// generate three random numbers
		int rand1 = (int) (Math.random() * firstWordsLength);
		int rand2 = (int) (Math.random() * secondWordsLength);
		int rand3 = (int) (Math.random() * thirdWordsLength);

		// building a new phrase
		String phrase = firstWords[rand1] + " " + secondWords[rand2] + " " + thirdWords[rand3];

		// print out the new phrase
		System.out.println("What we need is a " + phrase);

	}
}