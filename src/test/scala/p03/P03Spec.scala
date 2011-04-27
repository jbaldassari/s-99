package p03

import org.specs._

/**
 * Test for problem 3.
 */
class P03Spec extends SpecificationWithJUnit {
	"P03" should {
		"find the nth element of a list" in {
			val nth = P03.nth(2, List(1, 1, 2, 3, 5, 8))
			nth mustEqual 2
		}

		"find the nth element of a list by iterating" in {
			val nth = P03.nthIter(2, List(1, 1, 2, 3, 5, 8))
			nth mustEqual 2
		}

		"find the nth element of a list by recursion" in {
			val nth = P03.nthRecursive(2, List(1, 1, 2, 3, 5, 8))
			nth mustEqual 2
			P03.nthRecursive(0, List(1, 1, 2, 3, 5, 8)) mustEqual 1
		}
	}
}