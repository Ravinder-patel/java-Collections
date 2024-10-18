package Sets;

import java.util.HashSet;
import java.util.Iterator;

import org.testng.annotations.Test;

public class HashSetPrograms {
	@Test
	public void Example() {
		HashSet<Integer> hs = new HashSet<Integer>();
		System.out.println(hs);

	}

	@Test
	public void addElements() {
		HashSet<Integer> hs = new HashSet();
		hs.add(100);
		hs.add(100);
		hs.add(100);
		hs.add(100);
		hs.add(200);
		hs.add(50);
		hs.add(25); // does not follow insertion order and does not allow duplicates

		System.out.println(hs);

	}

	@Test
	public void addElements2() {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(100);
		hs.add(200);
		hs.add(50);
		hs.add(25); // does not follow insertion order and does not allow duplicates

		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(1000);
		hs2.add(2000);
		hs2.add(500);

		hs.addAll(hs2);
		System.out.println(hs);

	}
	@Test
	public void addElements3() {
		HashSet<Object> hs = new HashSet();
		hs.add(1);
		hs.add("Ravi");
		hs.add('M');
		hs.add(25); // does not follow insertion order and does not allow duplicates

		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(1000);
		hs2.add(2000);
		hs2.add(500);

		hs.addAll(hs2);
		System.out.println(hs);

	}

	@Test
	public void readElementsFromHashSet() {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(100);
		hs.add(200);
		hs.add(50);
		hs.add(25); // does not follow insertion order and does not allow duplicates

		System.out.println(hs);
		System.out.println("Read elements using for each loop ");
		for (Integer integer : hs) {
			System.out.println(integer);
		}
		System.out.println("Read elements using iterator ");

		Iterator<Integer> iterator = hs.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	/* Remove Elements */
	@Test
	public void removeElementsfromGHashSet() {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(100);
		hs.add(200);
		hs.add(50);
		hs.add(25); // does not follow insertion order and does not allow duplicates

		HashSet<Integer> b = new HashSet<Integer>();
		b.add(50);
		b.add(25);

		System.out.println(hs);

		hs.remove(100); // remove based on the object
		System.out.println(hs);

		hs.removeAll(b); // remove based on the collection
		System.out.println(hs);

		hs.clear(); // remove based on the collection
		System.out.println(hs);
	}

	@Test
	public void searchElementsfromGHashSet() {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(100);
		hs.add(200);
		hs.add(50);
		hs.add(25);

		HashSet<Integer> b = new HashSet<Integer>();
		b.add(50);
		b.add(25);

		System.out.println(hs);

		System.out.println(hs.contains(100));
		System.out.println(hs.contains(10));
		System.out.println(hs.containsAll(b));
		
		hs.retainAll(b);
		System.out.println(hs);

	}
	
	/*Miscellanous of HashSet*/
	@Test
	public void miscellanousOfHashSet() {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(100);
		hs.add(200);
		hs.add(50);
		hs.add(25);
		System.out.println(hs);
		
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		
		System.out.println("After converting into Array");
		Object[] array = hs.toArray();
		for (Object object : array) {
			System.out.println(object);
		}
		
	}
}
