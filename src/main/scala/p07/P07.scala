package p07

/**
 * Implementation of problem 7.
 */
object P07 {
	/**
	 * Flattens a nested list structure.
	 * @param list the nested list to flatten.
	 * @return the flattened list.
	 */
	def flatten(list: List[Any]): List[Any] = list.flatten(elem => elem match {
		case Nil => Nil
		case head :: tail => head :: flatten(tail)
		case elem => List(elem)
	})

	/**
	 * Flattens a nested list structure.
	 * @param list the nested list to flatten.
	 * @return the flattened list.
	 */
	def flatten2(list: List[Any]): List[Any] = list.flatten(elem => elem match {
		case Nil => Nil
		case elems: List[_] => flatten2(elems)
		case elem => List(elem)
	})

	/**
	 * Flattens a nested list structure.
	 * @param list the nested list to flatten.
	 * @return the flattened list.
	 */
	def flatten3(list: List[Any]): List[Any] = list.flatMap(elem => elem match {
		case Nil => Nil
		case elems: List[_] => flatten3(elems)
		case elem => List(elem)
	})
}