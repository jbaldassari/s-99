package p08

import org.specs._

/**
 * Test for problem 8.
 */
class P08Spec extends SpecificationWithJUnit {
	"P08" should {
		"eliminate consecutive duplicates of list elements recursively" in {
			P08.compressRecursive(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) mustEqual List('a, 'b, 'c, 'a, 'd, 'e)
		}
		"eliminate consecutive duplicates of list elements tail-recursively" in {
			P08.compressTailRecursive1(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) mustEqual List('a, 'b, 'c, 'a, 'd, 'e)
		}
		"eliminate consecutive duplicates of list elements tail-recursively" in {
			P08.compressTailRecursive2(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) mustEqual List('a, 'b, 'c, 'a, 'd, 'e)
		}
		"eliminate consecutive duplicates of list elements functionally" in {
			P08.compressFunctionalRight(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) mustEqual List('a, 'b, 'c, 'a, 'd, 'e)
		}
		"eliminate consecutive duplicates of list elements functionally" in {
			P08.compressFunctionalLeft(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) mustEqual List('a, 'b, 'c, 'a, 'd, 'e)
		}
	}
}
