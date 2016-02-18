package at.mcorp.sorters.insertionsort;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({InsertionSortTest
		.class, InsertionSortTestWithTheories.class, InsertionSortPerformanceTest.class})
public class AllInsertionSortTests {
//overall test suite
}
