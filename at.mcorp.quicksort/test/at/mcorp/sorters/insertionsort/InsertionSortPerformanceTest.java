package at.mcorp.sorters.insertionsort;

import at.corp.sorters.PerformanceSorterTest;
import at.mcorp.sorters.Sorter;

public class InsertionSortPerformanceTest extends PerformanceSorterTest {
	
	@Override
	public <T extends Comparable<T>> Sorter<T> createSorter(T[] arrayToSort) {
		return new InsertionSort<T>(arrayToSort);
	}

}
