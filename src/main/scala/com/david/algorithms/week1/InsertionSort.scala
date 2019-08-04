package com.david.algorithms.week1

object InsertionSort{

  def sort[A](implicit ord: Ordering[A]): Iterable[A] => Iterable[A] = unsorted =>
  {

    def go(sorted: Iterable[A], unsorted: Iterable[A]): Iterable[A] = unsorted match {
      case h :: Nil => insertInSorted(sorted, h)
      case Nil => sorted
      case h :: t => go(insertInSorted(sorted, h), t)
    }
    val head = unsorted.headOption
    head.fold(Iterable.empty[A])(h => go(Iterable(h), unsorted.tail))
  }

  private def insertInSorted[A](sorted: Iterable[A], element: A)(implicit ord: Ordering[A]): Iterable[A] = {
    val(head, tail) = sorted.span(ord.lt(_, element))
    head ++ Iterable(element) ++ tail
  }

}
