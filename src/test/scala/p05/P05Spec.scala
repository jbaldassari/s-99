package p05

import org.specs._

/**
 * Test for problem 5.
 */
class P05Spec extends SpecificationWithJUnit {
	"P05" should {
		"reverse the elements of a list" in {
			val reversed = P05.reverse(List(1, 1, 2, 3, 5, 8))
			reversed mustEqual List(8, 5, 3, 2, 1, 1)
		}
	
		"reverse the elements of a list recursively" in {
			val reversed = P05.reverseRecursive(List(1, 1, 2, 3, 5, 8))
			reversed mustEqual List(8, 5, 3, 2, 1, 1)
		}
		
		"reverse the elements of a list tail-recursively" in {
			val reversed = P05.reverseTailRecursive(List(1, 1, 2, 3, 5, 8))
			reversed mustEqual List(8, 5, 3, 2, 1, 1)
		}
		
		"reverse the elements of a list in a purely functional way" in {
			val reversed = P05.reverseFunctional(List(1, 1, 2, 3, 5, 8))
			reversed mustEqual List(8, 5, 3, 2, 1, 1)
		}
	}
}