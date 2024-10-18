package List;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import org.testng.annotations.Test;

public class VectorPrograms {
	@Test
	public void Example() {
		Vector<Integer> vect = new Vector<Integer>();

		System.out.println(vect);
	}

	//
	@Test
	public void addElementsIntoVector() {
		Vector<Integer> vect = new Vector<Integer>();

		vect.add(10);
		vect.add(20);
		vect.add(30);
		vect.add(40);
		vect.add(50);

		System.out.println(vect);
	}

	@Test
	public void addElementsIntoVector2() {
		Vector<Integer> vect = new Vector<Integer>();

		vect.add(10);
		vect.add(20);
		vect.add(1, 50);
		vect.addFirst(5);
		vect.addLast(100);
		System.out.println(vect);

		Vector<Integer> b = new Vector<Integer>();
		b.add(1000);
		b.add(2000);

		vect.addAll(b);
		System.out.println("After Add one covectection into another : " + vect);

		vect.addAll(1, b);
		System.out.println("After Add one covectection into another at index : " + vect);

	}
	/* Read elements from Vector */
	/* Using for "Iterator" */

	@Test
	public void readElementsFromVector() {
		Vector<Integer> vect = new Vector<Integer>();

		vect.add(10);
		vect.add(20);
		vect.add(30);
		vect.add(40);
		vect.add(50);

		Iterator<Integer> iterator = vect.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	/* Using for "List Iterator" */
	@Test
	public void readElementsFromVector2() {
		Vector<Integer> vect = new Vector<Integer>();

		vect.add(10);
		vect.add(20);
		vect.add(30);
		vect.add(40);
		vect.add(50);

		System.out.println("===Read In Forward Direction===");
		ListIterator<Integer> listIterator = vect.listIterator();
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
	public void readElementsFromVector3() {
		Vector<Integer> vect = new Vector<Integer>();

		vect.add(10);
		vect.add(20);
		vect.add(30);
		vect.add(40);
		vect.add(50);

		for (Integer data : vect) {
			System.out.println(data);
		}
	}

	/* Remove the elements from linked list */
	@Test
	public void removeElementsFromVector() {
		Vector<Integer> vect = new Vector<Integer>();

		vect.add(10);
		vect.add(20);
		vect.add(30);
		vect.add(40);
		vect.add(50);
		vect.add(10);
		vect.add(20);
		vect.add(30);
		vect.add(10);
		vect.add(10);
		vect.add(20);
		vect.add(30);
		System.out.println("Before removing element");
		System.out.println(vect);

		System.out.println("After removing element");
		vect.remove(1); // remove from index

		Vector<Integer> b = new Vector<Integer>();

		b.add(40);
		b.add(50);

		System.out.println("After removing of covectection elements");
		vect.removeAll(b);
		System.out.println(vect);

		System.out.println("After removing 1st & last");
		vect.removeFirst();
		vect.removeLast();
		System.out.println(vect);


	}

	/* retain the elements from linked list */
	@Test
	public void retainElementsofVectors() {
		Vector<Integer> vect = new Vector<Integer>();

		vect.add(10);
		vect.add(20);
		vect.add(30);
		System.out.println("before retaining of covectection elements");
		System.out.println(vect);

		Vector<Integer> b = new Vector<Integer>();

		b.add(20);
		b.add(30);

		System.out.println("After retaining of covectection elements");
		vect.retainAll(b);
		System.out.println(vect);

	}

	/*
	 * Clear():- • It is used to remove avect the elements from given covectection.
	 */
	@Test
	public void clearElementsFromVector() {
		Vector<Integer> vect = new Vector<Integer>();

		vect.add(10);
		vect.add(20);
		vect.add(30);
		System.out.println("before clearing elements");
		System.out.println(vect);

		System.out.println("After clearing elements");
		vect.clear();
		System.out.println(vect);

	}

	/*
	 * containsAvect(covectection):- • It is used to check whether the elements from the
	 * covectection .
	 */
	@Test
	public void conatnsElementsOfVector() {
		Vector<Integer> vect = new Vector<Integer>();

		vect.add(10);
		vect.add(20);
		vect.add(30);

		System.out.println(vect.contains(20));
		System.out.println(vect.contains(40));

		Vector<Integer> b = new Vector<Integer>();

		b.add(20);
		b.add(30);

		System.out.println("After comparing with covectection of elements");
		System.out.println(vect.containsAll(b));

	}

	/*
	 * IndexOf() in Vector
	 */
	@Test
	public void indexOfElementsOfVector() {
		Vector<Integer> vect = new Vector<Integer>();

		vect.add(10);
		vect.add(20);
		vect.add(30);

		System.out.println(vect.indexOf(20));
		System.out.println(vect);
	}

	/*
	 * Miscevectanous of Vector
	 */
	@Test
	public void miscevectanousOfVector() {
		Vector<Integer> vect = new Vector<Integer>();

		vect.add(10);
		vect.add(20);
		vect.add(30);

		System.out.println(vect.size());
		System.out.println(vect.isEmpty());
		System.out.println(vect.indexOf(20)); //

		Object[] arr = vect.toArray();
		System.out.println("Print Array: ");
		for (Object object : arr) {
			System.out.println(object);
		}
		

	}
}
