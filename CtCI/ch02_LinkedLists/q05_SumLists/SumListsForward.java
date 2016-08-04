package ch02_LinkedLists.q05_SumLists;

import ch02_LinkedLists.Node;

public class SumListsForward {

	private static int sumList(Node list) {
		if (list == null) {
			return 0;
		}

		int sum = 0;
		int multiplier = (int) Math.pow(10, list.length() - 1);
		while (list != null) {
			sum += list.data * multiplier;
			multiplier /= 10;
			list = list.next;
		}
		return sum;
	}

	private static Node intToList(int num) {
		Node list = null;

		while (num > 0) {
			Node nextDigit = new Node(num % 10);
			if (list == null) {
				list = nextDigit;
			} else {
				nextDigit.next = list;
				list = nextDigit;
			}

			num /= 10;
		}
		return list;
	}

	public static Node sumLists(Node listOne, Node listTwo) {
		int sum = sumList(listOne) + sumList(listTwo);
		return intToList(sum);
	}

}
