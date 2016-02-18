package at.mcorp.sorters.quicksort;

import at.corp.sorters.PerformanceSorterTest;
import at.mcorp.sorters.Sorter;

public class QuickSortPerformanceTest extends PerformanceSorterTest {

	@Override
	public <T extends Comparable<T>> Sorter<T> createSorter(T[] arrayToSort) {
		return new QuickSort<T>(arrayToSort);
	}

}
