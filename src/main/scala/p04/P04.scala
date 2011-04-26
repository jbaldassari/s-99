package p04

import scala.annotation._

/**
 * Implementation of problem 4.
 */
object P04 {
	/**
	 * Finds the length of a list.
	 * @param list the list whose length should be found.
	 * @return the length of the given list.
	 */
	def length[A](list: List[A]): Int = list.length

	/**
	 * Finds the length of a list recursively.
	 * @param list the list whose length should be found.
	 * @return the length of the given list.
	 */
	def lengthRecursive[A](list: List[A]): Int = list match {
		case Nil => 0
		case _ :: tail => 1 + lengthRecursive(tail)
	}
	
	/**
	 * Finds the length of a list tail-recursively.
	 * @param list the list whose length should be found.
	 * @return the length of the given list.
	 */
	def lengthTailRecursive[A](list: List[A]): Int = {
		@tailrec
		def lengthTailRecursive[A](length: Int, list: List[A]): Int = list match {
			case Nil => length
			case _ :: tail => lengthTailRecursive(length + 1, tail)
		}
		lengthTailRecursive(0, list)
	}
}