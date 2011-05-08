package p09

import scala.annotation._

/**
 * Implementation of problem 9.
 */
object P09 {
	/**
	 * Packs consecutive duplicates of list elements into sublists recursively.
	 * @param list the list to pack.
	 * @return the packed list.
	 */
	def packRecursive1[A](list: List[A]): List[List[A]] = list match {
		case Nil => Nil
		case elems => elems.takeWhile(_ == elems.head) :: packRecursive1(elems.dropWhile(_ == elems.head))
	}
	
	/**
	 * Packs consecutive duplicates of list elements into sublists recursively.
	 * @param list the list to pack.
	 * @return the packed list.
	 */
	def packRecursive2[A](list: List[A]): List[List[A]] = list match {
		case Nil => Nil
		case elems => elems.span(_ == elems.head) match { case (head, tail) => head :: packRecursive2(tail) }
	}
	
	/**
	 * Packs consecutive duplicates of list elements into sublists tail-recursively.
	 * @param list the list to pack.
	 * @return the packed list.
	 */
	def packTailRecursive1[A](list: List[A]): List[List[A]] = {
		@tailrec
		def packTailRecursive(result: List[List[A]], remainder: List[A]): List[List[A]] = remainder match {
			case Nil => result.reverse
			case elems => packTailRecursive(elems.takeWhile(_ == elems.head) :: result, remainder.dropWhile(_ == elems.head))
		}
		list match {
			case Nil => Nil
			case elems => packTailRecursive(Nil, elems)
		}
	}
	
	/**
	 * Packs consecutive duplicates of list elements into sublists tail-recursively.
	 * @param list the list to pack.
	 * @return the packed list.
	 */
	def packTailRecursive2[A](list: List[A]): List[List[A]] = {
		@tailrec
		def packTailRecursive(result: List[List[A]], remainder: List[A]): List[List[A]] = remainder match {
			case Nil => result.reverse
			case elems => elems.span(_ == elems.head) match { case (head, tail) => packTailRecursive(head :: result, tail) }
		}
		list match {
			case Nil => Nil
			case elems => packTailRecursive(Nil, elems)
		}
	}
	
	/**
	 * Packs consecutive duplicates of list elements into sublists functionally.
	 * @param list the list to pack.
	 * @return the packed list.
	 */
	def packFunctionalRight[A](list: List[A]): List[List[A]] = list.foldRight(List[List[A]]()) {
		(elem, result) => 
			if (result.isEmpty || (elem != result.head.head)) List(elem) :: result 
			else (elem :: result.head) :: result.tail
	}
	
	/**
	 * Packs consecutive duplicates of list elements into sublists functionally.
	 * @param list the list to pack.
	 * @return the packed list.
	 */
	def packFunctionalLeft[A](list: List[A]): List[List[A]] = list.foldLeft(List[List[A]]()) {
		(result, elem) => 
			if (result.isEmpty || (elem != result.head.head)) List(elem) :: result 
			else (elem :: result.head) :: result.tail
	}.reverse
}
