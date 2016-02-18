package at.mcorp.sorters.mergesort;

import at.corp.sorters.BasicSorterTest;
import at.mcorp.sorters.Sorter;

public class MergeSortTest extends BasicSorterTest {


	@Override
	public <T extends Comparable<T>> Sorter<T> createSorter(T[] arrayToSort) {
		return new MergeSort<T>(arrayToSort);
	}
	
}
