package by.iba.garukin.run;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import by.iba.garukin.model.SuperIterator;

/**
 * @author Aleksey Garukin
 *
 */
public class Runner {

	public static void main(String[] args) {

		Iterator<Integer> iterator1 = List.of(1, 5, 45, 345).iterator();
		Iterator<Integer> iterator2 = List.of(2, 4, 67, 105).iterator();

		Collection<Iterator<Integer>> collection = List.of(iterator1,
				iterator2);
		SuperIterator superIterator = new SuperIterator(collection);
		while (superIterator.hasNext())
			System.out.print(superIterator.next() + " ");
	}

}
