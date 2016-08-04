package ch02_LinkedLists.q05_SumLists;

import ch02_LinkedLists.Node;

public class SumListsReverse {

	public static Node sumLists(Node listOne, Node listTwo) {
		Node sum = null;
		Node sumTail = null;
		boolean carry = false;
		while (listOne != null || listTwo != null) {
			int digit;
			if (carry) {
				digit = 1;
			} else {
				digit = 0;
			}

			if (listOne != null) {
				digit += listOne.data;
				listOne = listOne.next;
			}
			if (listTwo != null) {
				digit += listTwo.data;
				listTwo = listTwo.next;
			}

			if (digit >= 10) {
				digit -= 10;
				carry = true;
			} else {
				carry = false;
			}

			if (sum == null) {
				sum = new Node(digit);
				sumTail = sum;
			} else {
				sumTail.next = new Node(digit);
				sumTail = sumTail.next;
			}
		}

		return sum;
	}

}
