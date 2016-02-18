package at.mcorp.sorters.quicksort;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({QuickSortTest
		.class, QuickSortTestWithTheories.class,QuickSortPerformanceTest.class})
public class AllQuickSortTests {
//overall test suite
}
