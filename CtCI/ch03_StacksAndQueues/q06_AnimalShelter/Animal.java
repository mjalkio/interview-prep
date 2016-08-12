package ch03_StacksAndQueues.q06_AnimalShelter;

public class Animal {
	private static int count = 0;

	private String name;
	private int arrivalNumber;

	public Animal(String name) {
		this.name = name;
		this.arrivalNumber = count++;
	}

	public int getArrivalNumber() {
		return arrivalNumber;
	}

	public String toString() {
		return name;
	}

}
