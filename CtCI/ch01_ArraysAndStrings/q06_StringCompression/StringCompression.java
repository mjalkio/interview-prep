package ch01_ArraysAndStrings.q06_StringCompression;

public class StringCompression {

	public static String stringCompression(String s) {
		StringBuilder comp = new StringBuilder();
		int i = 0;
		while (i < s.length()) {
			char c = s.charAt(i);
			int charCount = 1;
			while (i < s.length() - 1 && s.charAt(i + 1) == c) {
				charCount++;
				i++;
			}
			comp.append(c);
			comp.append(charCount);
			i++;
		}
		if (comp.length() < s.length()) {
			return comp.toString();
		} else {
			return s;
		}
	}

}
