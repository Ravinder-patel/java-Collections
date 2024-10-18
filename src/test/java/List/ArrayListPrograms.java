package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.testng.annotations.Test;

public class ArrayListPrograms {
	@Test
	public void Example() {
		ArrayList<Integer> al1 = new ArrayList<Integer>();

		System.out.println(al1);
		System.out.println("==============");
		ArrayList<Integer> al2 = new ArrayList<Integer>(10);

		System.out.println(al2);
	}

	/* Add elements into ArrayList */

	@Test
	public void addElementsToArrayList() {
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add(20); // insertion order

		al.add(2, 55); // add based on index >>>index will increase
		al.add(2, 66);

		al.addFirst(5);
		al.addFirst(15); // Adds an element as the first element of this collection

		al.addLast(100); // Adds an element as the last element of this collection

		al.add(4, 40);

		System.out.println(al);
	}

	/* Add all elements into ArrayList */

	@Test
	public void addElementsToArrayList2() {
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);

		System.out.println(al);

		ArrayList<Integer> b = new ArrayList<Integer>();

		b.add(100);
		b.add(200);
		b.addAll(b); /*
						 * Add same object into array list by using addAll().... Appends all of the
						 * elements in the specified collection to the end of the list
						 */
		b.addAll(al);
		b.addAll(0, al);

		System.out.println(b);

	}
	@Test
	public void addElementsToArrayList3() {
		List<Integer> arrayList = new ArrayList<Integer>();
		
		int[] a = { 10, 20, 30, 40, 50 };
		System.out.println(arrayList);
		for (int i : a) {
			arrayList.add(i);
		}
		System.out.println(arrayList);

	}
	
	@Test
	public void addElementsToArrayList4() {
		List<Integer> arrayList = new ArrayList<Integer>();
		
		List<Integer> asList = Arrays.asList(10, 20, 30, 40, 50);
		
		arrayList.addAll(asList);
		
		System.out.println(arrayList);

	}
	
	@Test
	public void addElementsToArrayList5() {

		List<Integer> arrayList = new ArrayList(Arrays.asList(10, 2, 30, 40, 50));
		
		System.out.println(arrayList);

	}

	/* Read elements from ArrayList */

	@Test
	public void readElementsFromArrayList() {
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);

		System.out.println(al);

		Iterator<Integer> iterator = al.iterator();
		System.out.println(iterator.hasNext());
		System.out.println(iterator.next());

	}

	@Test
	public void readElementsFromArrayList2() {
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);

		System.out.println(al);

		Iterator<Integer> iterator = al.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

	}

	@Test
	public void readElementsFromArrayList3() {
		ArrayList<String> al = new ArrayList<String>();

		al.add("Ravi");
		al.add("kiran");
		al.add("rajan");
		al.add("sam");
		al.add("kam");

		System.out.println(al);

		Iterator<String> iterator = al.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

	}

	/* Read elements in both direction we will go for "list Iterator" */
	@Test
	public void readElementsInBothDirection() {
		ArrayList<String> al = new ArrayList<String>();

		al.add("Ravi");
		al.add("kiran");
		al.add("rajan");
		al.add("sam");
		al.add("kam");

		System.out.println(al);

		ListIterator<String> listIterator = al.listIterator();

		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());

		}

		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());

		}
	}

	@Test
	public void readElementsUsingForEach() {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Ravi");
		al.add("kiran");
		al.add("rajan");
		al.add("sam");
		al.add("kam");

		System.out.println(al);

		for (String str : al) {
			System.out.println(str);
		}

	}

	@Test
	public void removeElementsfromArrayList() {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Ravi");
		al.add("kiran");
		al.add("rajan");
		al.add("sam");
		al.add("kam");

		System.out.println(al);
		al.remove(0);
		al.removeFirst();
		al.removeLast();
		System.out.println(al);
		al.removeAll(al);

		System.out.println(al);

	}

	@Test
	public void retainAllOfArrayList() {
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		System.out.println(al);

		ArrayList<Integer> b = new ArrayList<Integer>();

		b.add(10);
		b.add(20);
		b.add(80);
		b.add(90);
		System.out.println(b);

		al.retainAll(b); // keep all the same elements in both objects
		System.out.println(al);

	}

	/*
	 * Clear all the elements from collection It is used to remove all the elements
	 * from given collection.
	 */
	@Test
	public void clearAllFromArrayList() {
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		System.out.println("Before using clear method : " + al);

		al.clear();
		System.out.println("After using clear method : " + al);

	}

	/*
	 * To search an element contains(Object o):- • It is used to check whether the
	 * given element is present inside the collection or not. • If it is present
	 * returns true, otherwise it returns false.
	 */
	@Test
	public void containsElement() {
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		System.out.println(al.contains(10));
		ArrayList<Integer> b = new ArrayList<Integer>();

		b.add(10);
		b.add(20);
		System.out.println(al.containsAll(b)); /*
												 * true if this collection contains all of the elementsin the specified
												 * collection
												 */

	}
	/*
	 * indexOf():- • it is used to find index of particular element from the
	 * collection.
	 */
	@Test
	public void indexOfArrayList() {
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(40);
		al.add(40);
		al.add(50);

		System.out.println(al.indexOf(0));// if the number is not present it will give -1
		System.out.println(  al.indexOf(20));
		System.out.println(  al.indexOf(40));
		System.out.println(  al.lastIndexOf(40)); //the index of the last occurrence of the specified element in this list

		
	}
	
	/*Miscellanous:- */
	
	@Test
	public void sizeOfArrayList() {
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(  al.size()); // Returns the number of elements in this list.
		System.out.println(  al.isEmpty());
		System.out.println("=====Object Array after converting====");
		Object[] array = al.toArray();
		for (Object object : array) {
			System.out.println(object);
		}
		

		
	}
}
