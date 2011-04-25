package p01

import scala.annotation._

/**
 * Implementation of problem 1.
 */
object P01 {
	/**
	 * Finds the last element of a list.
	 * @param list in which to find the last element.
	 * @return the last element of the list.
	 */
	def last[A](list: List[A]): A = list.last
	
	/**
	 * Finds the last element of a list recursively.
	 * @param list in which to find the last element.
	 * @return the last element of the list.
	 */
	@tailrec
	def lastRecursive[A](list: List[A]): A  = list match {
		case Nil => throw new java.util.NoSuchElementException("empty list")
		case head :: Nil => head
		case _ :: tail => lastRecursive(tail)
	}
}
