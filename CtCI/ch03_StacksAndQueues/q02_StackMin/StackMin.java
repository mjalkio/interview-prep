package ch03_StacksAndQueues.q02_StackMin;

import ch03_StacksAndQueues.MyStack;

public class StackMin extends MyStack<Integer> {

	private MyStack<Integer> minimums;

	public StackMin() {
		minimums = new MyStack<Integer>();
	}

	public Integer pop() {
		Integer poppedVal = super.pop();
		if (poppedVal.equals(minimums.peek())) {
			minimums.pop();
		}
		return poppedVal;
	}

	public void push(Integer item) {
		if (minimums.isEmpty() || item.compareTo(minimums.peek()) < 0) {
			minimums.push(item);
		}

		super.push(item);
	}

	public Integer min() {
		return minimums.peek();
	}

}
