package ch02_LinkedLists;

/**
 * Implementation of a LinkedList from Cracking the Coding Interview.
 * 
 * @author Gayle Laakmann McDowell
 *
 */
public class Node {
	public Node next = null;
	public int data;

	public Node(int d) {
		data = d;
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

	public String toString() {
		StringBuilder s = new StringBuilder();
		Node n = this;
		while (n.next != null) {
			s.append(n.data);
			s.append(",");
		}
		s.append(n.data);
		return s.toString();
	}
}
