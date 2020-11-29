package common;

import java.util.Random;

public class RandomString {
	
	public RandomString() {
		
	}
	
	public String generateRandomEmail() {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		int length = 7;

	    for(int i = 0; i < length; i++) {
	    	int index = random.nextInt(alphabet.length());
	    	char randomChar = alphabet.charAt(index);
	    	sb.append(randomChar);
	    }
	    String randomString = sb.toString() + "@mail.com";
	    return randomString;
	    }
	

	public String generateRandomTitle() {
		Random random = new Random();
		int title = random.nextInt(3);
		if(title == 1) {
			return "Mr";
		} else if (title == 2) {
			return "Mrs";
		}
		return "Ms";
	}
	
	public String generateRandomEhicCard() {
		Random random = new Random();
		int card = random.nextInt(2);
		if(card == 1) {
			return "Yes";
		}
		return "No";
	}
	
	public String generateRandomReq() {
		Random random = new Random();
		int req = random.nextInt(2);
		if(req == 1) {
			return "Yes";
		}
		return "No";
	}
}
