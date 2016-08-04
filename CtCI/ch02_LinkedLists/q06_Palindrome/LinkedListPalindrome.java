package ch02_LinkedLists.q06_Palindrome;

import java.util.ArrayList;

import ch02_LinkedLists.Node;

public class LinkedListPalindrome {

	public static boolean isPalindrome(Node list) {
		if (list == null) {
			return false;
		}
		ArrayList<Integer> listCopy = new ArrayList<Integer>();
		while (list != null) {
			listCopy.add(list.data);
			list = list.next;
		}
		for (int i = 0; i < listCopy.size() / 2; i++) {
			if (!(listCopy.get(i).equals(listCopy.get(listCopy.size() - 1 - i)))) {
				return false;
			}
		}
		return true;
	}

}
