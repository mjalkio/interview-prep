package ch03_StacksAndQueues.q03_SetOfStacks;

import java.util.ArrayList;

import ch03_StacksAndQueues.MyStack;

public class SetOfStacks<T> {
	private int maxSize;
	private ArrayList<MyStack<T>> stacks;
	private int currentStackSize;

	public SetOfStacks(int maxSize) {
		this.maxSize = maxSize;
		stacks = new ArrayList<MyStack<T>>();
		currentStackSize = 0;
	}

	public T pop() {
		return null;
	}

	public void push(T item) {
	}

	public T peek() {
		return null;
	}

	public boolean isEmpty() {
		return true;
	}

}
