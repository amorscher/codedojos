package at.mcorp.sorters.insertionsort;

import at.corp.sorters.BasicSorterTest;
import at.mcorp.sorters.Sorter;

public class InsertionSortTest extends BasicSorterTest {


	@Override
	public <T extends Comparable<T>> Sorter<T> createSorter(T[] arrayToSort) {
		return new InsertionSort<T>(arrayToSort);
	}
	
}
