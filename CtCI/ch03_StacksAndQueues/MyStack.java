package ch03_StacksAndQueues;

import java.util.EmptyStackException;

public class MyStack<T> {
	private static class StackNode<T> {
		private T data;
		private StackNode<T> next;

		public StackNode(T data) {
			this.data = data;
		}

		public T getData() {
			return data;
		}
	}

	protected StackNode<T> top;

	public T pop() {
		if (top == null)
			throw new EmptyStackException();
		T item = top.getData();
		top = top.next;
		return item;
	}

	public void push(T item) {
		StackNode<T> t = new StackNode<T>(item);
		t.next = top;
		top = t;
	}

	public T peek() {
		if (top == null)
			throw new EmptyStackException();
		return top.data;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public String toString() {
		if (isEmpty()) {
			return "";
		}

		StringBuilder s = new StringBuilder();
		StackNode<T> node = top;
		while (node.next != null) {
			s.append(node.data);
			s.append(",");
			node = node.next;
		}
		s.append(node.data);
		return s.toString();
	}
}
