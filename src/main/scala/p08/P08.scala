package p08

import scala.annotation._

/**
 * Implementation of project 8.
 */
object P08 {
	/**
	 * Eliminate consecutive duplicates of list elements recursively.
	 * @param list the list to compress.
	 * @return the compressed list.
	 */
	def compressRecursive[A](list: List[A]): List[A] = list match {
		case Nil => Nil
		case head :: tail => head :: compressRecursive(tail.dropWhile(_ == head))
	}
	
	/**
	 * Eliminate consecutive duplicates of list elements tail-recursively.
	 * @param list the list to compress.
	 * @return the compressed list.
	 */
	def compressTailRecursive1[A](list: List[A]): List[A] = {
		/**
		 * Compresses the head of a list with the tail of the list.
		 * @param result accumulator list for the end result.
		 * @param head the current head being examined.
		 * @param tail the remainder of the list to process.
		 */
		@tailrec
		def compress(result: List[A], head: A, tail: List[A]): List[A] = tail match {
			case Nil => (head :: result).reverse
			case h :: t => if (head == h) compress(result, head, t) else compress(head :: result, h, tail)
		}
		list match {
			case Nil => Nil
			case head :: tail => compress(Nil, head, tail)
		}
	}

	/**
	 * Eliminate consecutive duplicates of list elements tail-recursively.
	 * @param list the list to compress.
	 * @return the compressed list.
	 */
	def compressTailRecursive2[A](list: List[A]): List[A] = {
		/**
		 * Compresses a list.
		 * @param result accumulator list for the end result.
		 * @param list the list to compress
		 */
		@tailrec
		def compress(result: List[A], list: List[A]): List[A] = list match {
			case Nil => result.reverse
			case head :: tail => compress(head :: result, tail.dropWhile(_ == head))
		}
		list match {
			case Nil => Nil
			case elems => compress(Nil, elems)
		}
	}

	/**
	 * Eliminate consecutive duplicates of list elements.
	 * @param list the list to compress.
	 * @return the compressed list.
	 */
	def compressFunctionalRight[A](list: List[A]): List[A] = list.foldRight(List[A]()) { 
		(elem, result) => 
			if (result.isEmpty || (elem != result.head)) elem :: result 
			else result
	}

	/**
	 * Eliminate consecutive duplicates of list elements.
	 * @param list the list to compress.
	 * @return the compressed list.
	 */
	def compressFunctionalLeft[A](list: List[A]): List[A] = list.foldLeft(List[A]()) { 
		(reversedResult, elem) => 
			if (reversedResult.isEmpty || (elem != reversedResult.head)) elem :: reversedResult
			else reversedResult
	}.reverse
}