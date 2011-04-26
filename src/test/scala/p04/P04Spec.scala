package p04

import org.specs._

/**
 * Test for problem 4.
 */
class P04Spec extends SpecificationWithJUnit {
	"P04" should {
		"find the number of elements in a list" in {
			val length = P04.length(List(1, 1, 2, 3, 5, 8))
			length mustEqual 6
		}

		"find the number of elements in a list recursively" in {
			val length = P04.lengthRecursive(List(1, 1, 2, 3, 5, 8))
			length mustEqual 6
		}

		"find the number of elements in a list tail-recursively" in {
			val length = P04.lengthTailRecursive(List(1, 1, 2, 3, 5, 8))
			length mustEqual 6
		}
	}
}