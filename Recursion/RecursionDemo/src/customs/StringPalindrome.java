package customs;

public class StringPalindrome {

	public static void main(String[] args) {
		String s = "mdm";
		System.out.println("Reverse String: " + stringPalindrome(s));

	}

	private static boolean stringPalindrome(String s) {
		if(s.length() == 1) return true;
		
		String last = s.substring(s.length() - 1);
		String everythingElse = s.substring(0, s.length() - 1);
		return last + stringPalindrome(everythingElse) == s;
	}

}
