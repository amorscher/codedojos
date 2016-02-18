package at.corp.sorters;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import at.mcorp.sorters.insertionsort.AllInsertionSortTests;
import at.mcorp.sorters.mergesort.AllMergeSortTests;
import at.mcorp.sorters.quicksort.AllQuickSortTests;

@RunWith(Suite.class)
@SuiteClasses({AllMergeSortTests.class
		, AllQuickSortTests.class,AllInsertionSortTests.class})
public class AllSortersTests {
//overall test suite
}
