package exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	public boolean IsValidateEmail(String email) {
		String regex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,16}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.find();
	}

	public boolean IsValidatePhoneNumber(String phoneNumber) {
		String regex = "\\d{3}/\\d{7}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phoneNumber);
		return matcher.find();
	}

}
