package ch02_LinkedLists;

/**
 * Implementation of a LinkedList from Cracking the Coding Interview.
 * 
 * @author Gayle Laakmann McDowell and Michael Jalkio
 *
 */
public class Node {
	public Node next = null;
	public int data;

	public Node(int d) {
		data = d;
	}

	public Node(int[] lst) {
		data = lst[0];
		for (int i = 1; i < lst.length; i++) {
			this.appendToTail(lst[i]);
		}
	}

	public void appendToTail(int d) {
		Node end = new Node(d);
		Node n = this;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}

	public Node deleteNode(Node head, int d) {
		Node n = head;
		if (n.data == d) {
			return head.next; // moved head
		}

		while (n.next != null) {
			if (n.next.data == d) {
				n.next = n.next.next;
				return head; // head didn't change
			}
			n = n.next;
		}
		return head;
	}

	public int length() {
		int length = 1;
		Node n = this;
		while (n.next != null) {
			length++;
			n = n.next;
		}
		return length;
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		Node n = this;
		while (n.next != null) {
			s.append(n.data);
			s.append(",");
			n = n.next;
		}
		s.append(n.data);
		return s.toString();
	}
}
