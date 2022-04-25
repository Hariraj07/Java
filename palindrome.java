package Org.pal;

public class Palindrome {
	public static void main(String[] args) {
		String s = "racecar";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			rev = rev + c;
		}
		if (rev.equals(s)) {
			System.out.println("The word is palindrome ");
		} else {
			System.out.println("The word is not a palindrome ");
		}
	}
}
