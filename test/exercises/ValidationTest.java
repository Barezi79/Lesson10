package exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ValidationTest {
	
	Validation TV = new Validation();
	
	@Test
	void IsValidateEmail() {
		assertTrue(TV.IsValidateEmail("Branislav79@gmail.com"));		
		assertFalse(TV.IsValidateEmail("user@hotmail"));
		assertFalse(TV.IsValidateEmail("@yahoo.com")); 
		 
	}
	
	@Test
	void IsValidatePhoneNumber() throws Exception {
		assertTrue(TV.IsValidatePhoneNumber("064/2191610"));
		assertFalse(TV.IsValidatePhoneNumber("+3816421as91610"));
		assertFalse(TV.IsValidatePhoneNumber("+(381)64-2191610568"));
	}

}
