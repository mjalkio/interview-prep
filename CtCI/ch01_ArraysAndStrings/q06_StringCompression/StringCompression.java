package ch01_ArraysAndStrings.q06_StringCompression;

public class StringCompression {

	public static String stringCompression(String s) {
		String comp = "";
		int i = 0;
		while (i < s.length()) {
			char c = s.charAt(i);
			int charCount = 1;
			while (i < s.length() - 1 && s.charAt(i + 1) == c) {
				charCount++;
				i++;
			}
			comp = comp + c + charCount;
			i++;
		}
		if (comp.length() < s.length()) {
			return comp;
		} else {
			return s;
		}
	}

}
