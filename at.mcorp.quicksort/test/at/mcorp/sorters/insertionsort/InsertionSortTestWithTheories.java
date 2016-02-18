package at.mcorp.sorters.insertionsort;

import org.junit.experimental.theories.Theories;
import org.junit.runner.RunWith;

import at.corp.sorters.TheoriesBasedSorterTest;
import at.mcorp.sorters.Sorter;
import at.mcorp.sorters.quicksort.QuickSort;

/**
 * Test class for the {@link QuickSort} class by using {@link Theories} to
 * create a combination of integer values
 * 
 * @author ambros
 *
 */
@RunWith(Theories.class)
public class InsertionSortTestWithTheories extends TheoriesBasedSorterTest{

	@Override
	public <T extends Comparable<T>> Sorter<T> createSorter(T[] arrayToSort) {
		return new InsertionSort<T>(arrayToSort);
	}
}