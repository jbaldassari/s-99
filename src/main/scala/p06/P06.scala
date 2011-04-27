package p06

import scala.annotation._

/**
 * Implementation of problem 6.
 */
object P06 {
	/**
	 * Tests whether a given list is a palindrome.
	 * @param the list to test.
	 * @return true if the list is a palindrome; false otherwise.
	 */
	def isPalindromeSimple[A](list: List[A]): Boolean = list == list.reverse
		
	/**
	 * Tests whether a given list is a palindrome tail-recursively
	 * @param the list to test.
	 * @return true if the list is a palindrome; false otherwise.
	 */
	def isPalindromeTailRecursive[A](list: List[A]): Boolean = {
		// Start in the middle and work our way out to either side, comparing each pair
		@tailrec
		def isPalindrome[A](list: List[A], left: Int, right: Int, eval: Boolean): Boolean = left match {
			case 0 => eval && (list.apply(left) == list.apply(right))
			case _ => {
				isPalindrome(list, left - 1, right + 1, eval && (list.apply(left) == list.apply(right)))
			}
		}
		list match {
			case Nil => false
			case _ => list.length match {
				case 0 => false
				case 1 => true
				case _ => {
					val (left, right) = findCenter(list)
					isPalindrome(list, left, right, true)
				}
			}
		}
	}
	
	/**
	 * Finds the indices of the left and right element(s) at the middle of the list.
	 * If the list's length is even, 2 different adjacent indices will be returned.
	 * If the list's length is odd, both indices will be equal.
	 * @param list the list whose center should be found.
	 * @return pair containing the left and right indices of the center of the list.
	 */
	private def findCenter[A](list: List[A]): (Int, Int) = {
		val halfLength = list.length / 2
		if ((list.length % 2) == 0) {
			(halfLength - 1, halfLength)
		}
		else {
			(halfLength, halfLength)
		}
	}
}