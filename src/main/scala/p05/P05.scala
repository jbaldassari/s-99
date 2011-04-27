package p05

import scala.annotation._

/**
 * Implementation of problem 5.
 */
object P05 {
	/**
	 * Reverses the elements of a list.
	 * @param list the list to reverse.
	 * @return the reversed list.
	 */
	def reverse[A](list: List[A]): List[A] = list.reverse
	
	/**
	 * Reverses the elements of a list recursively.
	 * @param list the list to reverse.
	 * @return the reversed list.
	 */
	def reverseRecursive[A](list: List[A]): List[A] = list match {
		case Nil => Nil
		case head :: tail => reverseRecursive(tail) ::: List(head)
	}
	
	/**
	 * Reverses the elements of a list tail-recursively.
	 * @param list the list to reverse.
	 * @return the reversed list.
	 */
	def reverseTailRecursive[A](list: List[A]): List[A] = {
		@tailrec
		def reverseTailRecursive[A](result: List[A], remainder: List[A]): List[A] = remainder match {
			case Nil => result
			case head :: tail => reverseTailRecursive(head :: result, tail)
		}
		reverseTailRecursive(Nil, list)
	}
	
	/**
	 * Reverses the elements of a list in a purely functional way.
	 * @param list the list to reverse.
	 * @return the reversed list.
	 */
	def reverseFunctional[A](list: List[A]): List[A] = list.foldLeft(List[A]()) {
		(result, elem) => elem :: result 
	}
}