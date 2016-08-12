package ch03_StacksAndQueues.q06_AnimalShelter;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class AnimalShelter {
	private LinkedList<Dog> dogs;
	private LinkedList<Cat> cats;

	public AnimalShelter() {
		dogs = new LinkedList<Dog>();
		cats = new LinkedList<Cat>();
	}

	public void enqueue(Animal animal) {
		if (animal instanceof Dog) {
			dogs.add((Dog) animal);
		} else if (animal instanceof Cat) {
			cats.add((Cat) animal);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public Animal dequeueAny() {
		if (dogs.isEmpty() && cats.isEmpty()) {
			throw new NoSuchElementException();
		} else if (dogs.isEmpty()) {
			return cats.remove();
		} else if (cats.isEmpty()) {
			return dogs.remove();
		} else {
			if (dogs.peek().getArrivalNumber() > cats.peek().getArrivalNumber()) {
				return cats.remove();
			} else {
				return dogs.remove();
			}
		}
	}

	public Dog dequeueDog() {
		if (dogs.isEmpty()) {
			throw new NoSuchElementException();
		}

		return dogs.remove();
	}

	public Cat dequeueCat() {
		if (cats.isEmpty()) {
			throw new NoSuchElementException();
		}

		return cats.remove();
	}
}
