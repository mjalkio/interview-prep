package ch03_StacksAndQueues.q04_QueueViaStack;

import java.util.NoSuchElementException;

import ch03_StacksAndQueues.MyStack;

public class MyQueue<T> {
	private MyStack<T> addStack;
	private MyStack<T> removeStack;

	public MyQueue() {
		addStack = new MyStack<T>();
		removeStack = new MyStack<T>();
	}

	public boolean isEmpty() {
		return addStack.isEmpty() && removeStack.isEmpty();
	}

	public void add(T item) {
		addStack.push(item);
	}

	private void moveForPeekOrRemove() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		} else if (removeStack.isEmpty()) {
			while (!addStack.isEmpty()) {
				removeStack.push(addStack.pop());
			}
		}
	}

	public T peek() {
		moveForPeekOrRemove();
		return removeStack.peek();
	}

	public T remove() {
		moveForPeekOrRemove();
		return removeStack.pop();
	}

}
