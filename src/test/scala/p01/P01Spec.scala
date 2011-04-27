package p01

import org.specs._

/**
 * Test for problem 1.
 */
class P01Spec extends SpecificationWithJUnit {
	"P01" should {
		"find the last element of a list" in {
			val last = P01.last(List(1, 1, 2, 3, 5, 8))
			last mustEqual 8
		}

		"find the last element of a list recursively" in {
			val last = P01.lastRecursive(List(1, 1, 2, 3, 5, 8))
			last mustEqual 8
			P01.lastRecursive(List(1)) mustEqual 1
		}
	}
}