package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import org.testng.annotations.Test;

public class LinkedListPrograms {
	@Test
	public void Example() {
		LinkedList<Integer> ll = new LinkedList<Integer>();

		System.out.println(ll);
	}

	//
	@Test
	public void addElementsIntoLinkedlist() {
		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);

		System.out.println(ll);
	}

	@Test
	public void addElementsIntoLinkedlist2() {
		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(10);
		ll.add(20);
		ll.add(1, 50);
		ll.addFirst(5);
		ll.addLast(100);
		System.out.println(ll);

		LinkedList<Integer> b = new LinkedList<Integer>();
		b.add(1000);
		b.add(2000);

		ll.addAll(b);
		System.out.println("After Add one collection into another : " + ll);

		ll.addAll(1, b);
		System.out.println("After Add one collection into another at index : " + ll);

	}
	/* Read elements from LinkedList */
	/* Using for "Iterator" */

	@Test
	public void readElementsFromLinkedlist() {
		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);

		Iterator<Integer> iterator = ll.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	/* Using for "List Iterator" */
	@Test
	public void readElementsFromLinkedlist2() {
		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);

		System.out.println("===Read In Forward Direction===");
		ListIterator<Integer> listIterator = ll.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());

		}

		System.out.println("===Read In backward Direction===");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());

		}
	}

	/* Using "for each loop" */
	@Test
	public void readElementsFromLinkedlist3() {
		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);

		for (Integer data : ll) {
			System.out.println(data);
		}
	}

	/* Remove the elements from linked list */
	@Test
	public void removeElementsFromLinkedlist() {
		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(10);
		ll.add(10);
		ll.add(20);
		ll.add(30);
		System.out.println("Before removing element");
		System.out.println(ll);

		System.out.println("After removing element");
		ll.remove(1); // remove from index

		LinkedList<Integer> b = new LinkedList<Integer>();

		b.add(40);
		b.add(50);

		System.out.println("After removing of collection elements");
		ll.removeAll(b);
		System.out.println(ll);

		System.out.println("After removing 1st & last");
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);

		System.out.println("After removing 1st occurence of element");
		ll.removeFirstOccurrence(10);
		System.out.println(ll);

		System.out.println("After removing last occurence of element");
		ll.removeLastOccurrence(20);
		System.out.println(ll);

	}

	/* retain the elements from linked list */
	@Test
	public void retainElementsofLinkedlists() {
		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(10);
		ll.add(20);
		ll.add(30);
		System.out.println("before retaining of collection elements");
		System.out.println(ll);

		LinkedList<Integer> b = new LinkedList<Integer>();

		b.add(20);
		b.add(30);

		System.out.println("After retaining of collection elements");
		ll.retainAll(b);
		System.out.println(ll);

	}

	/*
	 * Clear():- • It is used to remove all the elements from given collection.
	 */
	@Test
	public void clearElementsFromLinkedlist() {
		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(10);
		ll.add(20);
		ll.add(30);
		System.out.println("before clearing elements");
		System.out.println(ll);

		System.out.println("After clearing elements");
		ll.clear();
		System.out.println(ll);

	}

	/*
	 * containsAll(collection):- • It is used to check whether the elements from the
	 * collection .
	 */
	@Test
	public void conatnsElementsOfLinkedlist() {
		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(10);
		ll.add(20);
		ll.add(30);

		System.out.println(ll.contains(20));
		System.out.println(ll.contains(40));

		LinkedList<Integer> b = new LinkedList<Integer>();

		b.add(20);
		b.add(30);

		System.out.println("After comparing with collection of elements");
		System.out.println(ll.containsAll(b));

	}

	/*
	 * IndexOf() in linkedlist
	 */
	@Test
	public void indexOfElementsOfLinkedlist() {
		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(10);
		ll.add(20);
		ll.add(30);

		System.out.println(ll.indexOf(20));
		System.out.println(ll);
	}

	/*
	 * Miscellanous of LinkedList
	 */
	@Test
	public void miscellanousOfLinkedlist() {
		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(10);
		ll.add(20);
		ll.add(30);

		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.indexOf(20)); //

		Object[] arr = ll.toArray();
		System.out.println("Print Array: ");
		for (Object object : arr) {
			System.out.println(object);
		}
		

	}
}
