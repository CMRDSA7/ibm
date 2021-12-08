package by.iba.garukin.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Custom Iterator for sorting collection
 * 
 * @author Aleksey Garukin
 * 
 */
public class SuperIterator implements Iterator<Integer> {

	Collection<Iterator<Integer>> collection;
	private HashMap<Integer, Iterator<Integer>> currentPositions = new HashMap<>();
	private PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

	public SuperIterator(Collection<Iterator<Integer>> collection) {
		this.collection = collection;
		collection.forEach(itr -> {
			if (itr.hasNext()) {
				Integer value = itr.next();
				priorityQueue.add(value);
				currentPositions.put(value, itr);
			}
		});
	}

	@Override
	public boolean hasNext() {
		return !priorityQueue.isEmpty();
	}

	@Override
	public Integer next() {
		Integer value = priorityQueue.poll();
		Iterator<Integer> currentItr = currentPositions.remove(value);
		if (currentItr != null && currentItr.hasNext()) {
			Integer newVal = currentItr.next();
			priorityQueue.add(newVal);
			currentPositions.put(newVal, currentItr);
		}
		return value;
	}
}