package ch03_StacksAndQueues.q03_SetOfStacks;

import java.util.ArrayList;
import java.util.EmptyStackException;

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
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		currentStackSize--;
		MyStack<T> currentStack = stacks.get(stacks.size() - 1);
		if (currentStackSize == 0) {
			stacks.remove(stacks.size() - 1);
			currentStackSize = maxSize;
		}
		return currentStack.pop();
	}

	public void push(T item) {
		if (isEmpty() || currentStackSize == maxSize) {
			stacks.add(new MyStack<T>());
			currentStackSize = 0;
		}

		MyStack<T> currentStack = stacks.get(stacks.size() - 1);
		currentStack.push(item);
		currentStackSize++;
	}

	public T peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		MyStack<T> currentStack = stacks.get(stacks.size() - 1);
		return currentStack.peek();
	}

	public boolean isEmpty() {
		return stacks.isEmpty();
	}

}
