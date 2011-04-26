package p02

import scala.annotation._

/**
 * Implementation of problem 2.
 */
object P02 {
	/**
	 * Finds the penultimate element of a list.
	 * @param list in which to find penultimate element.
	 * @return the penultimate element of the list.
	 */
	def penultimate1[A](list: List[A]): A = list.splitAt(list.length-2) match {
		case (_,tail) => tail.head
	}

	/**
	 * Finds the penultimate element of a list.
	 * @param list in which to find the penultimate element.
	 * @return the penultimate element of the list.
	 */
	def penultimate2[A](list: List[A]): A = list.init.last
	
	/**
	 * Finds the penultimate element of a list recursively.
	 * @param list in which to find the penultimate element.
	 * @return the penultimate element of the list.
	 */
	@tailrec
	def penultimateRecursive[A](list: List[A]): A = list match {
		case Nil => throw new java.util.NoSuchElementException("empty list")
		case head :: tail :: Nil => head
		case _ :: tail => penultimateRecursive(tail)
	}
}
