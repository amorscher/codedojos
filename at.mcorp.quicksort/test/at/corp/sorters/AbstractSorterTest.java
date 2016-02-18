package at.corp.sorters;

import at.mcorp.sorters.Sorter;

public abstract class AbstractSorterTest {

	public abstract <T extends Comparable<T>> Sorter<T> createSorter(T[] arrayToSort);
	
	
	
}
