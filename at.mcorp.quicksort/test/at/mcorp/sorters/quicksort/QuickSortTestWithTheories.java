package at.mcorp.sorters.quicksort;

import org.junit.experimental.theories.Theories;
import org.junit.runner.RunWith;

import at.corp.sorters.TheoriesBasedSorterTest;
import at.mcorp.sorters.Sorter;

/**
 * Test class for the {@link QuickSort} class by using {@link Theories} to
 * create a combination of integer values
 * 
 * @author ambros
 *
 */
@RunWith(Theories.class)
public class QuickSortTestWithTheories  extends TheoriesBasedSorterTest{

	@Override
	public <T extends Comparable<T>> Sorter<T> createSorter(T[] arrayToSort) {
		return new QuickSort<T>(arrayToSort);
	}
}
