package p02

import org.specs._

/**
 * Test for problem 2.
 */
class P02Spec extends SpecificationWithJUnit {
	"P02" should {
		"find the penultimate element of a list" in {
			val last = P02.penultimate1(List(1, 1, 2, 3, 5, 8))
			last mustEqual 5
		}

		"find the penultimate element of a list" in {
			val last = P02.penultimate2(List(1, 1, 2, 3, 5, 8))
			last mustEqual 5
		}
		
		"find the penultimate element of a list recursively" in {
			val last = P02.penultimateRecursive(List(1, 1, 2, 3, 5, 8))
			last mustEqual 5
		}
	}
}
