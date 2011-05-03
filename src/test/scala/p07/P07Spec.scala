package p07

import org.specs._

/**
 * Test for problem 7.
 */
class P07Spec extends SpecificationWithJUnit {
	"P07" should {
		"flatten a nested list 1" in {
			P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) mustEqual List(1, 1, 2, 3, 5, 8)
		}

		"flatten a nested list 2" in {
			P07.flatten2(List(List(1, 1), 2, List(3, List(5, 8)))) mustEqual List(1, 1, 2, 3, 5, 8)
		}
		
		"flatten a nested list 3" in {
			P07.flatten3(List(List(1, 1), 2, List(3, List(5, 8)))) mustEqual List(1, 1, 2, 3, 5, 8)
		}
	}
}