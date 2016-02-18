package at.mcorp.sorters.mergesort;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({MergeSortTest
		.class, MergeSortTestWithTheories.class,MergeSortPerformanceTest.class})
public class AllMergeSortTests {
//overall test suite
}
