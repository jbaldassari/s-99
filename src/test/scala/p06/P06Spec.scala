package p06

import org.specs._

/**
 * Test for problem 6.
 */
class P06Spec  extends SpecificationWithJUnit {
	"P06" should {
		"test whether a list is a palindrome" in {
			P06.isPalindromeTailRecursive(List()) must beFalse
			P06.isPalindromeTailRecursive(List(1)) must beTrue
			P06.isPalindromeTailRecursive(List(1, 1)) must beTrue
			P06.isPalindromeTailRecursive(List(1, 2)) must beFalse
			P06.isPalindromeTailRecursive(List(1, 2, 1)) must beTrue
			P06.isPalindromeTailRecursive(List(1, 2, 2, 1)) must beTrue
			P06.isPalindromeTailRecursive(List(1, 2, 3, 2, 1)) must beTrue
			P06.isPalindromeTailRecursive(List(1, 2, 3, 4, 5)) must beFalse
			P06.isPalindromeTailRecursive("racecar".toList) must beTrue
			P06.isPalindromeTailRecursive("abcdefg".toList) must beFalse
			P06.isPalindromeTailRecursive("a man a plan a canal panama".toList) must beFalse
			P06.isPalindromeTailRecursive("a man a plan a canal panama".replaceAll(" ", "").toList) must beTrue
		}
	}
}