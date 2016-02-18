package at.mcorp.sorters.mergesort;

import at.corp.sorters.PerformanceSorterTest;
import at.mcorp.sorters.Sorter;

public class MergeSortPerformanceTest extends PerformanceSorterTest {

	@Override
	public <T extends Comparable<T>> Sorter<T> createSorter(T[] arrayToSort) {
		return new MergeSort<T>(arrayToSort);
	}

}
