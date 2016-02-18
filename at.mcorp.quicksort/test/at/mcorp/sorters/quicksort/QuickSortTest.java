package at.mcorp.sorters.quicksort;

import at.corp.sorters.BasicSorterTest;
import at.mcorp.sorters.Sorter;

public class QuickSortTest  extends BasicSorterTest{

	@Override
	public <T extends Comparable<T>> Sorter<T> createSorter(T[] arrayToSort) {
		return new QuickSort<T>(arrayToSort);
	}


	
	
}
