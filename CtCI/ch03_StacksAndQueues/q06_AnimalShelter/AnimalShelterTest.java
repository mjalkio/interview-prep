package ch03_StacksAndQueues.q06_AnimalShelter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnimalShelterTest {
	@Test
	public void test() {
		AnimalShelter shelter = new AnimalShelter();
		shelter.enqueue(new Dog("Spot"));
		assertEquals("Spot", shelter.dequeueAny().toString());
		shelter.enqueue(new Dog("Spot"));
		shelter.enqueue(new Dog("Woofers"));
		assertEquals("Spot", shelter.dequeueAny().toString());
		assertEquals("Woofers", shelter.dequeueAny().toString());

		shelter.enqueue(new Dog("Spot"));
		shelter.enqueue(new Dog("Woofers"));
		assertEquals("Spot", shelter.dequeueDog().toString());
		assertEquals("Woofers", shelter.dequeueDog().toString());

		shelter.enqueue(new Dog("Spot"));
		shelter.enqueue(new Dog("Woofers"));
		shelter.enqueue(new Cat("Whiskers"));
		shelter.enqueue(new Cat("Fluffy"));
		assertEquals("Spot", shelter.dequeueAny().toString());
		assertEquals("Woofers", shelter.dequeueAny().toString());
		assertEquals("Whiskers", shelter.dequeueAny().toString());
		assertEquals("Fluffy", shelter.dequeueAny().toString());

		shelter.enqueue(new Dog("Spot"));
		shelter.enqueue(new Dog("Woofers"));
		shelter.enqueue(new Cat("Whiskers"));
		shelter.enqueue(new Cat("Fluffy"));
		assertEquals("Whiskers", shelter.dequeueCat().toString());
		assertEquals("Spot", shelter.dequeueDog().toString());
		assertEquals("Woofers", shelter.dequeueAny().toString());
		assertEquals("Fluffy", shelter.dequeueAny().toString());

	}
}
