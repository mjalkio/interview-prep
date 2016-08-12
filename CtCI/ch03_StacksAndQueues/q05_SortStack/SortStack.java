package ch03_StacksAndQueues.q05_SortStack;

import ch03_StacksAndQueues.MyStack;

public class SortStack {

	public static void sortStack(MyStack<Integer> stack) {
		MyStack<Integer> sorted = new MyStack<Integer>();

		while (!stack.isEmpty()) {
			int nextNum = stack.pop();
			while (!sorted.isEmpty() && nextNum < sorted.peek()) {
				stack.push(sorted.pop());
			}
			sorted.push(nextNum);
		}
		while (!sorted.isEmpty()) {
			stack.push(sorted.pop());
		}
	}

}
