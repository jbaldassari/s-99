package p03

import scala.annotation._

/**
 * Implementation of problem 3.
 */
object P03 {
	/**
	 * Finds the nth element of a list.
	 * @param n the index of the element to find.
	 * @param list in which to find the nth element.
	 * @return the nth element of the list.
	 */
	def nth[A](n: Int, list: List[A]): A = list.apply(n)
	
	/**
	 * Finds the nth element of a list by iterating over the list.
	 * @param n the index of the element to find.
	 * @param list in which to find the nth element.
	 * @return the nth element of the list.
	 */
	def nthIter[A](n: Int, list: List[A]): A = {
		for ((elem, index) <- list.zipWithIndex) {
			if (index == n) {
				return elem
			}
		}
		throw new java.util.NoSuchElementException("list contains fewer than " + n + " elements")
	}
	
	/**
	 * Finds the nth element of a list recursively.
	 * @param n the index of the element to find.
	 * @param list in which to find the nth element.
	 * @return the nth element of the list.
	 */
	@tailrec
	def nthRecursive[A](n: Int, list: List[A]): A = (n, list) match {
		case (0, head :: _) => head
		case (_, _ :: tail) => nthRecursive(n - 1, tail)
		case _ => throw new java.util.NoSuchElementException("list contains fewer than " + n + " elements")
	}
}