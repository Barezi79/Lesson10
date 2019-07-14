package exercises;

import java.util.ArrayList;
import java.util.List;

import examples.FileHelper;

public class Palindrome {

	List<String> words = new ArrayList<String>();

	Palindrome() {
		words = loadWords();
	}

	public List<String> loadWords() {
		return FileHelper.loadFileContentsIntoArrayList("resource/words.txt");
	}

	public boolean wordFind(String string) {
		return words.contains(string);
	}

	public boolean wordIsAPalindrome(String string) {
		return wordFind(string) && wordFind(new StringBuilder(string).reverse().toString());
	}
}
